public class Docente extends Persona{
    private String insegnamento;

    public Docente(){
        super();
        this.insegnamento = new String("");
    }

    public Docente(String nome, String cognome, int eta, String insegnamento){
        super(nome, cognome, eta);
        this.insegnamento = new String(insegnamento);
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
    public String getInsegnamento(){
        return this.insegnamento;
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
    public void setInsegnamento(String insegnamento){
        this.insegnamento = new String(insegnamento);
    }

    @Override
    public double calcolaCostoBiglietto(double prezzoIntero){
        return prezzoIntero*0.1;
    }
}