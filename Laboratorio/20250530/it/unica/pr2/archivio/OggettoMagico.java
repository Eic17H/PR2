package it.unica.pr2.archivio;

public class OggettoMagico {
    private String nome;
    private int livello;
    private StatoOggetto stato;
    private String proprietario;

    public OggettoMagico() {
        this.nome = new String("");
        this.stato = StatoOggetto.DISPONIBILE;
        this.livello = 0;
        this.proprietario = new String("Chiara");
    }

    public OggettoMagico(String nome, int livello) {
        this();
        this.nome = new String(nome);
        this.livello = livello;
    }

    public OggettoMagico(String nome, int livello, String proprietario) {
        this(nome, livello);
        this.proprietario = proprietario;
    }

    public int getLivello() {
        return this.livello;
    }

    public String getNome() {
        return this.nome;
    }

    public StatoOggetto getStatoOggetto() {
        return this.stato;
    }

    public void getStatoOggetto(StatoOggetto stato) {
        this.stato = stato;
    }

    public String descrizione() {
        return new String("Nome: "+this.getNome());
    }

    public String getProprietario() {
        return new String(this.proprietario);
    }
}
