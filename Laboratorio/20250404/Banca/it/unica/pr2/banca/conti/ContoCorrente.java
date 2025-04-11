package it.unica.pr2.banca.conti;
public class ContoCorrente extends ContoBancario{
    private double rendimentoAnnuo;

    public ContoCorrente(){
        super();
        this.rendimentoAnnuo = 0;
    }

    public ContoCorrente(ContoCorrente that){
        super((ContoBancario) that);
        this.rendimentoAnnuo = that.getRendimentoAnnuo();
    }

    public ContoCorrente(String nome, String cognome, double saldo, double rendimentoAnnuo){
        super(nome, cognome, saldo);
        this.rendimentoAnnuo = rendimentoAnnuo;
    }

    public double getRendimentoAnnuo(){
        return this.rendimentoAnnuo;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(obj == null) return false;
        else if (obj.getClass() != this.getClass()) return false;

        ContoBancario that = (ContoBancario) obj;
        
        return (this.getNome().equals(that.getNome())) && (this.getCognome().equals(that.getCognome())) && (this.getSaldo() == that.getSaldo());
    }
}
