package it.unica.pr2.banca.conti;
public class ContoBancario{
    private String nome;
    private String cognome;
    private int numeroConto;
    private double saldo;
    private static int numeroConti = 1000;

    public ContoBancario(){
        numeroConti++;
        this.nome = new String("");
        this.cognome = new String("");
        this.numeroConto = numeroConti;
    }

    public ContoBancario(ContoBancario that){
        numeroConti++;
        this.nome = new String(that.getNome());
        this.cognome = new String(that.getCognome());
        this.numeroConto = that.getNumeroConto();
        this.saldo = that.getSaldo();
    }
    
    public ContoBancario(String nome, String cognome, double saldo){
        numeroConti++;
        this.nome = new String(nome);
        this.cognome = new String(cognome);
        this.numeroConto = numeroConti;
        this.saldo = saldo;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public String getNomeCompleto(){
        return this.getNome() + " " + this.getCognome();
    }
    public int getNumeroConto(){
        return this.numeroConto;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public static double convertiInEuro(double valore, double tassoConversione){
        return valore*tassoConversione;
    }

    public void preleva(double quantita){
        if(quantita > this.saldo) throw new InsufficientFundsException();
        if(quantita < 0) throw new IllegalArgumentException("Argomento non valido");
        this.saldo -= quantita;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(obj == null) return false;
        else if (obj.getClass() != this.getClass()) return false;

        ContoBancario that = (ContoBancario) obj;
        
        return (this.nome.equals(that.nome))
            && (this.cognome.equals(that.cognome))
            && (this.numeroConto == that.numeroConto)
            && (this.saldo == that.saldo);
    }
}