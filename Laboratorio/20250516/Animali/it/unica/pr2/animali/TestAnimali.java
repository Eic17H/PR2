package it.unica.pr2.animali;
import java.util.*;

public class TestAnimali{

    public static void main(String[] args){

        Animale gattoS = new Gatto("Siberiano");
        Animale caneM = new Cane("Maltese");

        assert caneM instanceof Animale;
        assert gattoS instanceof Animale;

        assert ("Bau Bau").equals(caneM.verso());
        assert ("Miao Miao").equals(gattoS.verso());

        
        assert Animale.animaliTotali() == 2;

        
        List<Animale> animali = new ArrayList<>();
        animali.add(caneM);
        animali.add(gattoS);

        assert animali.indexOf(caneM) == Animale.animali().indexOf(caneM);
        
        try{
            Animale canePT = new Cane("PastoreTedesco");
        }catch(NumeroEccessivoException e){
            assert ("Non puoi inserire più di due animali").equals(e.getMessage());
        }
        
        
        List<String> versiMaiscoliSenzaSpazi = Animale.streamVersiMaiuscoliSenzaSpazi();
        assert versiMaiscoliSenzaSpazi.equals(Arrays.asList("BAUBAU","MIAOMIAO"));
        /**/
    }   
}