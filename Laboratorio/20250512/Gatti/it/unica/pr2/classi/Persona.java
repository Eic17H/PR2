package it.unica.pr2.classi;

public class Persona implements Comparable {
    private String nome;
    private String cognome;
    private int annoNascita;

    public Persona(){
        this.nome = new String("NOME");
        this.cognome = new String("COGNOME");
        this.annoNascita = 1970;
    }

    public Persona(String nome, String cognome, int annoNascita){
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    @Override
    public <T super Persona> int compareTo (Persona that){
        return (this.cognome + this.nome + this.annoNascita).compareTo(that.cognome + that.nome + that.annoNascita);
    }
}