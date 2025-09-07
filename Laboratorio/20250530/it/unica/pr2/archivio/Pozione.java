package it.unica.pr2.archivio;

public class Pozione extends OggettoMagico {
    private String potere;

    public Pozione() {
        this.potere = new String("");
    }

    public Pozione(String nome, int livello, String potere) {
        super(nome, livello);
        this.potere = new String(potere);
    }

    public String getPotere() {
        return new String(this.potere);
    }

    @Override
    public String descrizione() {
        return new String(super.descrizione()+", rarita: "+this.getPotere());
    }
}
