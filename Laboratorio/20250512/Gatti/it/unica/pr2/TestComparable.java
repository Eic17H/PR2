package it.unica.pr2;

import it.unica.pr2.classi.Animale;
import it.unica.pr2.classi.Gatto;
import it.unica.pr2.classi.Persona;
import it.unica.pr2.classi.Studente;

import java.util.*;

public class TestComparable {

    public static void main(String[] args) {

        /* Anche se non è possibile istanziare le interfacce (e le classi astratte)
         * è comunque possibile creare array di questi tipi. Tutti gli elementi
         * dell'array dovranno appartenere a classi che implementano l'interfaccia
         * (o che estendono la classe astratta).
         */
        Comparable[] c = new Comparable[5];

        // Nome, Cognome, anno di nascita
        c[0] = new Persona("Mario", "Rossi", 1980);

        // Nome, lunghezza della coda in cm
        c[1] = new Gatto("Fuffi", 10.0);

        // Nome, Cognome, anno di nascita, università, voto di laurea
        c[2] = new Studente("Bruno", "Bianchi", 1991, "Cagliari", 109);

        // Nome
        c[3] = new Animale("Boris");


        // In questo esercizio due Persone sono uguali se hanno stesso anno di nascita
        Persona  mario = (Persona) c[0];
        Studente bruno = (Studente) c[2];
        Studente gianni = new Studente("Gianni", "Verdi", 1980, "Sassari", 110);

        assert mario.equals(gianni) : "mario e gianni hanno lo stesso anno di nascita, ma equals ha reso false";
        assert gianni.equals(mario) : "L'implementazione del metodo equals non ha rispettato la proprietà simmetrica";
        
        Persona bruno2 = new Persona("Bruno", "Bianchi", 1991);

        assert !mario.equals(bruno2) : "mario e gianni hanno diversi anno di nascita, ma equals ha reso true";
        assert bruno2.equals(bruno) : "bruno (dall'array) e bruno2 hanno lo stesso anno di nascita, ma equals ha reso false";
        




        // In questo esercizio due Animali sono uguali se hanno stesso nome
        Animale boris = (Animale) c[3];
        Gatto fuffi = (Gatto) c[1];

        assert !boris.equals(fuffi) : "boris e fuffi hanno nome diverso, ma equals ha reso true";

        Gatto boris2 = new Gatto("Boris", 12.5);

        assert boris2.equals(boris) : "boris (dall'array) e boris2 hanno lo stesso nome, ma equals ha reso false";






        Persona[] persone = new Persona[3];

        persone[0] = new Persona("Bruno", "Bianchi", 1991);
        persone[1] = new Persona("Mario", "Rossi", 1980);
        persone[2] = new Persona("Carlo", "Verdi", 1985);

        assert Arrays.toString(persone).equals("[Bruno, Mario, Carlo]") : "C'è un problema con l'implementazione del metodo Persona.toString()";

        
        // /* Ordinamento dell'array.
        //  * L'array viene ordinato automaticamente da Java se il tipo dell'array
        //  * (cioè Persona) è comparabile. Non è quindi necessario implementare
        //  * un algoritmo di ordinamento in Java ma solo il metodo di confronto.
        //  * Vogliamo ordinare persone in ordine decrescente per anno di nascita.
        //  
        Arrays.sort(persone);

        assert Arrays.toString(persone).equals("[Bruno, Carlo, Mario]") : "L'array non è ordinato dal più giovane al più vecchio";





        Animale[] animali = new Animale[3];
        animali[0] = new Animale("Fuffi");
        animali[1] = new Animale("Bau");
        animali[2] = new Animale("Boris");


        assert Arrays.toString(animali).equals("[Fuffi, Bau, Boris]") : "C'è un problema con l'implementazione del metodo Animale.toString()";


        // /* Ordinamento dell'array.
        //  * L'array viene ordinato automaticamente da Java se il tipo dell'array
        //  * (cioè Persona) è comparabile. Non è quindi necessario implementare
        //  * un algoritmo di ordinamento in Java ma solo il metodo di confronto.
        //  * Vogliamo ordinare animali in ordine alfabetico decrescente.
        //  
        Arrays.sort(animali);

        assert Arrays.toString(animali).equals("[Fuffi, Boris, Bau]") : "L'array non è ordinato in ordine alfabetico decrescente";

        






        // /* Ordinamento dell'array.
        //  * Ordinamento in base al voto di laurea:
        //  * -1 se s1.votoDiLaurea < s2.votoDiLaurea
        //  * +1 se s1.votoDiLaurea > s2.votoDiLaurea
        //  * 0 se s1.votoDiLaurea == s2.votoDiLaurea
        //  

        Studente[] studenti = new Studente[5];
        studenti[0] = new Studente("Bruno", "Bianchi", 1991, "Cagliari", 110);
        studenti[1] = new Studente("Mario", "Rossi", 1980, "Cagliari", 109);
        studenti[2] = new Studente("Carlo", "Verdi", 1985, "Sassari", 105);
        studenti[3] = new Studente("Massimo", "Aranzulla", 1999, "Cagliari", 111);
        studenti[4] = new Studente("Diego", "Zedda", 1985, "Pisa", 105);

        /* INSERISCI QUI IL CODICE PER FARE L'ORDINAMENTO */
        



        /*FINE IMPLEMENTAZIONE ORDINAMENTO */

        assert Arrays.toString(studenti).equals("[Carlo, Diego, Mario, Bruno, Massimo]") : "C'è un problema con la comparazione del voto di laurea.";


    
        // /* Ordinamento dell'array.
        //  * Ordinamento in base alla lunghezza della coda
        //  * restituendo -1 se g1.getCoda() < g2.getCoda()
        //  * restituendo 1 se g1.getCoda() > g2.getCoda()
        //  * restituendo 0 se g1.getCoda() == g2.getCoda()
        //  
        Gatto[] gatti = new Gatto[3];
        gatti[0] = new Gatto("Fuffi", 50.0);
        gatti[1] = new Gatto("Bau", 50.5);
        gatti[2] = new Gatto("Boris", 49.9);

        /* INSERISCI QUI IL CODICE PER FARE L'ORDINAMENTO */
        





        /*FINE IMPLEMENTAZIONE ORDINAMENTO */
       

        assert Arrays.toString(gatti).equals("[Boris, Fuffi, Bau]") : "C'è un problema con la comparazione della lunghezza della coda.";

    }

}
