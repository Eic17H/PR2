package it.unica.pr2.animali;

public class NumeroEccessivoException extends RuntimeException {
    NumeroEccessivoException() {
        
    }

    public String getMessage() {
        return new String("Non puoi inserire più di due animali");
    }
}
