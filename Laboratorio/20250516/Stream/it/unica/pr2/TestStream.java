import java.util.List;
import java.util.Arrays;
import static java.util.stream.Collectors.toList;


public class TestStream {

    public static void main(String[] args) {

        List<String> miaCollection = Arrays.asList("My", "name", "is", "Mario", "Rossi");
        System.out.println("Collezione iniziale:");
        System.out.println(miaCollection.toString());


        List<String> collectionMaiuscola = miaCollection.stream()
            .map(String::toUpperCase)
            .collect(toList());
        
        System.out.println("Collezione maiuscola:");
        System.out.println(collectionMaiuscola.toString());


        List<String> collectionBrevi = miaCollection.stream()
            .filter(e -> e.length()<=4)
            .collect(toList());


        System.out.println("Collezione con le parole di massimo 4 lettere:");
        System.out.println(collectionBrevi.toString());
    }

}
