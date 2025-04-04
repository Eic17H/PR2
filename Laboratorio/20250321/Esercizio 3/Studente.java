public class Studente extends Persona{
    private int matricola;
    private int annoIscrizione;

    public Studente(){
        super();
        this.matricola = 0;
        this.annoIscrizione = 0;
    }

    public Studente(String nome, String cognome, int eta, int matricola, int annoIscrizione){
        super(nome, cognome, eta);
        this.matricola = matricola;
        this.annoIscrizione = annoIscrizione;
    }

    public String getNome(){
        return super.getNome();
    }
    public String getCognome(){
        return super.getCognome();
    }
    public int getEta(){
        return super.getEta();
    }
    public int getMatricola(){
        return this.matricola;
    }
    public int getAnnoIscrizione(){
        return this.annoIscrizione;
    }

    public void setNome(String nome){
        super.setNome(nome);
    }
    public void setCogome(String cognome){
        super.setCognome(cognome);
    }
    public void setEta(int eta){
        super.setEta(eta);
    }
    public void setMatricola(int matricola){
        this.matricola = matricola;
    }
    public void setAnnoIscrizione(int annoIscrizione){
        this.annoIscrizione = annoIscrizione;
    }

    @Override
    public double calcolaCostoBiglietto(double prezzoIntero){
        if(this.getEta()<=30) return 0;
        if(2025-annoIscrizione<3) return prezzoIntero*0.5;
        return super.calcolaCostoBiglietto(prezzoIntero);
    }
}