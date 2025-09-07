package it.unica.pr2.archivio;

import java.util.*;

public class TestArchivioArcano {

    public static void main(String[] args) {

        //18
        ArchivioArcano archivio = new ArchivioArcano();

        archivio.aggiungi(new Pozione("Elisir", 5, "Cura"));  //nome, livello, potere
        archivio.aggiungi(new Artefatto("Anello Ombroso", 10, Rarita.RARO)); //nome, livello, rarita
        archivio.aggiungi(new Artefatto("Bastone del Fuoco", 20, Rarita.LEGGENDARIO, "Merlino")); //nome, livello, rarit, utilzzatore
        archivio.aggiungi(new Pozione("Pozione Insonnia", 8, "Veglia Prolungata")); //nome, livello, potere

        assert archivio.numOggetti() == 4;
        assert archivio.getOggettiMagici().get(0) instanceof OggettoMagico;

        
        //22
        List<String> nomiForti = archivio.oggettiForti(9);
        assert nomiForti.contains("Bastone del Fuoco");
        assert nomiForti.contains("Anello Ombroso");

        
        // 24
        String effetto1 = archivio.usaOggetto("Elisir", "Chiara");
        assert effetto1.contains("Cura");
        assert archivio.statoOggetto("Elisir") == StatoOggetto.CONSUMATO;

        
        // Artefatti sono riutilizzabili
        String effetto2 = archivio.usaOggetto("Anello Ombroso", "Chiara");
        assert effetto2.contains("raro");

        
        // Uso vietato
        try {
            archivio.usaOggetto("Bastone del Fuoco", "Chiara");
            assert false; // non deve arrivarci
        } catch (AccessoNegatoException e) {
            assert e.getMessage().contains("Merlino");
        }

        
        // 27
        String effetto3 = archivio.usaOggetto("Bastone del Fuoco", "Merlino");
        assert effetto3.contains("Fuoco");

        String effetto4 = archivio.usaOggetto("Pozione Insonnia", "Chiara");
        assert effetto4.contains("Veglia");

        
        //30
        List<String> ordinati = archivio.elencoOrdinatoPerLivello();
        assert ordinati.get(0).equals("Elisir"); // livello 5
        assert ordinati.get(3).equals("Bastone del Fuoco"); // livello 20



       /** */
    }
}