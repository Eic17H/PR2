package it.unica.pr2.archivio;
import java.util.*;
import java.util.stream.Collectors;

public class ArchivioArcano {
    private List<OggettoMagico> oggetti;

    ArchivioArcano() {
        this.oggetti = new ArrayList<OggettoMagico>();
    }

    void aggiungi(OggettoMagico addendo) {
        oggetti.add(addendo);
    }

    int numOggetti() {
        return oggetti.size();
    }

    List<OggettoMagico> getOggettiMagici() {
        return this.oggetti;
    }

    List<String> oggettiForti(int lvl) {
        return this.oggetti.stream()
        .filter(a -> (a.getLivello() >= lvl))
        .map(OggettoMagico::getNome)
        .collect(java.util.stream.Collectors.toList());
    }

    StatoOggetto statoOggetto(String nome) {
        return oggetti.stream()
        .filter(a -> a.getNome().equals(nome))
        .collect(java.util.stream.Collectors.toList())
        .get(0)
        .getStatoOggetto();
    }

    String usaOggetto(String nome, String utilizzatore) {
        /*
        OggettoMagico b = oggetti.stream()
            .filter(a -> a.getNome().equals(nome))
            .filter(a -> a.getProprietario().equals(utilizzatore))
            .collect(java.util.stream.Collectors.toList())
            .get(0);
            b.getStatoOggetto(StatoOggetto.CONSUMATO);
            return b.descrizione();
        /*/try{
            OggettoMagico b = oggetti.stream()
            .filter(a -> a.getNome().equals(nome))
            .filter(a -> a.getProprietario().equals(utilizzatore))
            .collect(java.util.stream.Collectors.toList())
            .get(0);
            b.getStatoOggetto(StatoOggetto.CONSUMATO);
            return b.descrizione();
        } catch (RuntimeException e) {
            throw new AccessoNegatoException(utilizzatore, oggetti.stream()
            .filter(a -> a.getNome().equals(nome))
            .collect(java.util.stream.Collectors.toList())
            .get(0).getProprietario());
        }// */
    }

    public List<String> elencoOrdinatoPerLivello() {
        List<OggettoMagico> lista = oggetti;
        lista.sort((a,b) -> a.getLivello()-b.getLivello());
        return lista.stream().map(a -> a.getNome()).collect(Collectors.toList());
    }
}
