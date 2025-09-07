package it.unica.pr2.archivio;

public class AccessoNegatoException extends RuntimeException {
    private String nomeUtilizzatore;
    private String nomeProprietario;

    AccessoNegatoException(String nomeUtilizzatore, String nomeProprietario) {
        this.nomeUtilizzatore = nomeUtilizzatore;
        this.nomeProprietario = nomeProprietario;
    }

    public String getMessage() {
        return new String(nomeUtilizzatore + " ha provato a usare l'oggetto di " + nomeProprietario);
    }

}
