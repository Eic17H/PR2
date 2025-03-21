public class Persona{
    private String nome;
    private String cognome;
    private int eta;

    public Persona(){
        this.nome = new String("");
        this.cognome = new String("");
        this.eta = 0;
    }

    public Persona(String nome, String cognome, int eta){
        this.nome = new String(nome);
        this.cognome = new String(cognome);
        this.eta = eta;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public int getEta(){
        return this.eta;
    }

    public void setNome(String nome){
        this.nome = new String(nome);
    }
    public void setCognome(String cognome){
        this.cognome = new String(cognome);
    }
    public void setEta(int eta){
        this.eta = eta;
    }
}