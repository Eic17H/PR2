# Classi anonime

Se c'è una classe che devi usare solo una volta, è scomodo dover fare un intero file per questa classe. Se di queste classe a utilizzo singolo ce ne sono 500, sono tanti file, e usare GitHub diventa lentissimo. Quindi usiamo le *classi anonime*, cioè creiamo una classe a cui non diamo un nome, e contemporaneamente istanziamo un singolo oggetto di quella classe, e subito dopo la classe smette di esistere. Una dichiarazione di classe anonima conta come una riga, quindi alla fine ci va il punto e virgola.

Le classi anonime possono estendere un'altra classe o implementare un'interfaccia.

Vedi le slide è troppo veloce. Final etc.

In IUM, si implementano delle interfacce grafiche. Un tempo per farlo su Android si usava Java (adesso Kotlin). Le GUI sono implementate come *eventi*, e, per esempio, ogni bottone ha bisogno della propria classe. Se hai 800 bottoni, anziché fare 800 classi in 800 file diversi, usi le classi anonime.

# Espressioni Lambda

Le lambda sono un modo di Java per cercare di modernizzarsi poco poco. Ok bellissimi gli oggetti quanto vuoi ma ogni tanto sono un po' pesanti. Ci sono momenti in cui fa comodo tornare al C, e definire comportamenti che ci servono solo una volta, un po' come le classi anonime. Le Java Lambda sono piuttosto snelle, stanno spesso in una riga: `(argomenti) -> {corpo}`.

Sono utili per le interfacce funzionali, interfacce con un solo metodo da implementare, per esempio `Predicate<T>`, che ha solo il metodo `boolean test(T)`. Anziché creare una classe che implementa `Predicate`, passiamo una funzione lambda che diventa l'implementazione del metodo.

Un esempio pratico di utilizzo sono gli algoritmi di ordinamento. I criteri di ordinamento sono funzioni, metodi, questo vale in generale. Quindi possiamo definire in una riga un criterio.

## Esempio di utilizzo

### Vedi se capisci questo

```
static <T extends Comparable<? super T>> void sort(List<T> list)
```

Allora, è un metodo generico, quindi il tipo `T` è parametrico. `T` deve estendere i comparable di una propria superclasse (o di sé stessa). Cioè? Deve essere confrontabile con `T`, e possibilmente anche con la sua superclasse, o con la superclasse di quella, e così via.

### L'esempio vero e proprio

```
static <T> void sort(List<T> list, Comparator<? super T> comparator) vedi slide non ho visto bene.
```

Visto che la nostra classe è comparabile, non c'è bisogno di specificarla. Invece il comparator può essere una lambda.

```
Comparator <String> ignoreFirstCharComparator = (a,b) -> a.substring(1).compareTo(b.substring(1));
```