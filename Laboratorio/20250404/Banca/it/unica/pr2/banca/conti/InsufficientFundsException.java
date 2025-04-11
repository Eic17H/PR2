package it.unica.pr2.banca.conti;
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(){
        super("Non hai fondi sufficienti!");
    }
}
