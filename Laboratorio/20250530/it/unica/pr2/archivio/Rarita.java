package it.unica.pr2.archivio;

public enum Rarita {
    COMUNE,
    RARO,
    LEGGENDARIO;

    @Override
    public String toString() {
        switch(this) {
            case COMUNE: return new String("comune");
            case RARO: return new String("raro");
            case LEGGENDARIO: return new String("leggendario");
            default: return new String("");
        }
    }
}
