package it.unica.pr2.animali;
import java.util.*;

public class Animale {
    private String razza;
    private String versoo;
    private static List<String> versi = new ArrayList<String>();
    private static int animaliTot = 0;
    private static List<Animale> listaAnimali = new ArrayList<>();

    Animale(String razza, String verso) throws NumeroEccessivoException{
        if(animaliTot > 2) throw new NumeroEccessivoException();
        this.razza = new String(razza);
        this.versoo = new String(verso);
        animaliTot++;
        listaAnimali.add(this);
        versi.add(this.verso());
    }

    public static int animaliTotali() {
        return animaliTot;
    }

    public String verso() {
        return this.versoo;
    }

    public static List<Animale> animali() {
        return listaAnimali;
    }

    public static List<String> streamVersiMaiuscoliSenzaSpazi() {
        return versi.stream()
            .map(String::toUpperCase)
            .collect(java.util.stream.Collectors.toList());
    }
}
