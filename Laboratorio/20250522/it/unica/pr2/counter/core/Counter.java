package it.unica.pr2.counter.core;
import java.util.*;


public class Counter<T> extends HashSet<T> {
    private int count;
    private HashMap<T, Integer> counters;

    public Counter() {
        count = 0;
        counters = new HashMap<T, Integer>();
    }

    public Counter(List<T> l) {
        count = 0;
        counters = new HashMap<T, Integer>();
        super.addAll(l);
    }

    public int count() {
        return this.count;
    }

    public int count(T o) {
        return counters.get(o);
    }

    @Override
    public boolean add(T o) {
        try {counters.put(o, counters.get(o)+1);}
        catch(NullPointerException e) {counters.put(o, 1);}
        count++;
        return super.add(o);
    }

    @Override
    public boolean remove(Object o) {
        this.count -= this.count((T) o);
        this.counters.put((T) o, 0);
        return super.remove(o);
    }

    public boolean addText(String s) {
        List<Object> lista = Arrays.asList(s.split(" "));
        List<T> listtttt = (List<T>) lista;
        if(counters.keySet().toArray()[0].getClass() == s.getClass())
            return this.addAll(listtttt);
        else
            throw new RuntimeException("addText() only works for Counter<String>, not other types of Counter<>");
    }
}
