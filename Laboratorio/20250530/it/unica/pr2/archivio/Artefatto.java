package it.unica.pr2.archivio;

public class Artefatto extends OggettoMagico {
    private Rarita rarita;
    private String utilizzatore;

    public Artefatto() {
        this.rarita = Rarita.COMUNE;
        this.utilizzatore = new String("");
    }
    
    public Artefatto(String nome, int livello, Rarita rarita) {
        super(nome, livello);
        this.rarita = rarita;
    }
    
    public Artefatto(String nome, int livello, Rarita rarita, String utilizzatore) {
        super(nome, livello, utilizzatore);
        this.rarita = rarita;
    }

    public Rarita getRarita() {
        return this.rarita;
    }

    @Override
    public String descrizione() {
        return new String(super.descrizione()+", rarita: "+this.getRarita());
    }
}
