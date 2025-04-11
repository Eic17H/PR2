package it.unica.pr2.banca;

import it.unica.pr2.banca.conti.*;

public class TestBanca{

    public static void main(String[] args){

        //nome, cognome, primo versamento
        ContoBancario conto1 = new ContoBancario("Paolo", "Rossi", 10000);

        //nome, cognome, primo versamento, percentuale rendimento annuo
        ContoCorrente conto2 = new ContoCorrente("Luisa", "Verdi", 1000, 5);

        ContoCorrente conto3 = new ContoCorrente();
        
        
        assert conto2 instanceof ContoBancario;

        
        assert conto3.getNumeroConto() == 1003;
        
        assert conto3.getSaldo() == 0;
        

        ContoBancario conto4 = new ContoBancario("Paolo", "Rossi", 10000);
        assert !conto4.equals(conto1);
        
        ContoCorrente conto5 = new ContoCorrente(conto2);
	    assert conto5.equals(conto2);

        
        double dollari = 50;
        double tassoConversione = 0.92;
        double euro = ContoBancario.convertiInEuro(dollari, tassoConversione);
        double risultatoAtteso = 46.0;
        assert euro == risultatoAtteso;

        conto2.preleva(633.48);
        assert conto2.getSaldo() == 366.52;
        
        try{
           conto2.preleva(2000); 
        }catch (InsufficientFundsException e){
            assert e instanceof RuntimeException;
            assert e.getMessage().equals("Non hai fondi sufficienti!");
        }
        
        try{
           conto2.preleva(-1000); 
        }catch (IllegalArgumentException e){
            assert e.getMessage().equals("Argomento non valido");
        }
        
    }
}