
/*
 * consegna in 100 minuti
 *
 * due in 100 minutes
 * to enable assertion use: -ea (or -enableassertions) 
 *
 *
 * Nota: non usare classi/interfacce non viste a lezione
 *
 */
package it.unica.pr2.counter.test;

import it.unica.pr2.counter.core.Counter;
import java.util.*;

public class TestCounter {

    public static void main(String[] args) {

        // 19
        Counter<String> counter1 = new Counter<>();
        assert counter1 instanceof HashSet;
        
        assert counter1.size() == 0;
        counter1.add("rome");
        counter1.add("milan");
        assert counter1.size() == 2;
        
        for (String word: "rome and genoa are cities".split(" ")) {
            counter1.add(word);
        }
        assert counter1.size() == 6; // different words sent to the counter
        // 24
        Set<String> s = new HashSet<>();
        for (String word: "rome milan genoa and are cities".split(" ")) {
            s.add(word);
            }
            assert counter1.equals(s); // act like a Set
            
            assert counter1.count("milan") == 1;
            assert counter1.count("rome") == 2;
            assert counter1.count() == 7; // total counts (including repetitions)
            
            Counter<Integer> counter2 = new Counter<>();
            counter2.add(20);
            counter2.add(30);
            
            counter2.add(20);
            assert counter2.count(30) == 1;
            assert counter2.count(20) == 2;
            assert counter2.count() == 3;
            assert counter2.size() == 2;
            
            // 27 hints: usare addAll() presente in Set
            Counter<String> counter3 = new Counter<>(Arrays.asList("Hello", "World!", "How", "Are", "You", "Hello"));
            Counter<Double> counter4 = new Counter<>(Arrays.asList(1.0, 2.0, -7.0));
            assert counter3.size() == 5;
            assert counter4.size() == 3;
            
            assert counter3.count("Hello") == 2;
            assert counter4.count(-7.0) == 1;
            
            
            // 30
            assert counter1.count() == 7;
            assert counter1.count("rome") == 2;
            assert counter1.size() == 6;
            
            counter1.remove("rome");
            assert counter1.count("rome") == 0;
            assert counter1.count() == 7-2;
            assert counter1.size() == 6-1;
            
            
            /*
            // overflow
            counter1.addText("ciao da me"); // they are all added 
            
            assert counter1.size() == 8;
            
            try {
                counter2.addText("ciao da me");
                assert false;
                } catch (Exception e) {
                    assert e.getMessage().equals("addText() only works for Counter<String>, not other types of Counter<>");
                    assert true;
                    }
        */
        /**/
    }

}
