Il 23 e il 30, simulazioni di esame
Oltre a quelle due ci sono lunedì e venerdì
Il primo appello è il 6 giugno

Oggi lezione corta ma difficile

## Argomenti:
* Varargs
* Interfacce importanti
* Collections

Le varargs e le collections saranno nell'esercizio di oggi. Da oggi abbandoniamo gli array

# Varargs

Capita di dover scrivere metodi con tanti parametri, o lo stesso metodo con un numero variabile di parametri. Soluzioni? Magari passare un array, o fare l'overloading tante volte quante sono le quantità possibili di argomenti. Entrambe le strategie hanno problemi. Gli array hanno dimensione fissa, stai riservando uno spazio in memoria, magari 1000 int, ma ne usi 3 nella maggior parte dei casi. Invece se fai l'overloading, immagina un metodo che fa la somma, 1000 metodi con la firma simile, e più vai avanti più la firma e lunga. E poi immagina dover fare modifiche.

Ecco perché sono stati introdotti i varargs. Tutti i parametri devono essere dello stesso tipo. Si scrive `(String... ingredienti)`, dove `ingredienti` diventa un array.

Finito.

# Interfacce importanti

## Clonable

Non contengono qualcosa, ma danno struttura al codice. Non ha metodi dichiarati, ma segna che la nostra classe che lo implementa, implementa il metodo `clone`.

## Iterable

Interfaccia che dice che è possibile iterare su quella classe. Implementata da quasi tutte le interfacce. Permette in modo molto semplice di scorrere. In C, quando abbiamo implementato le liste, dovevamo tenere traccia dei puntatori. Gli iterable hanno invece un metodo per farlo in modo semplice, `foreach`, che prende un metodo come parametro e lo applica a *tutti* gli oggetti.

## Iterator

Permette di scorrere un iterable. Ha alcuni metodi utili:

* `forEachRemaining` - come `forEach`, ma gli passi l'elemento da cui partire
* `hasNext` - come in ASD, `if(x.next != null) ...`
* `next` - autoesplicativo
* `remove` - rimuove l'ultimo elemento

## Comparable

Definisce l'ordine naturale delle cose, con il metodo `T::compareTo(T o)`, che restituisce un numero negativo se il parametro viene prima del chiamante, 0 se sono uguali, e un numero negativo se il parametro viene dopo.

## Comparator

Definisce l'ordinamento totale. Definiamo, in un'altra classe, un metodo che confronta due elementi, `compare(T o1, T o2)`. Di nuovo, restituisce un numero negativo se o1<o2, e così via.

# Collections

Sono nel package `java.util`, che va importato manualmente. Si usano perlopiù le liste, i set e le mappe.

## List<T>

Molto più semplice che in C. Una lista di dimensione variabile, di oggetti senza un ordine particolare. Come coi vettori, possiamo indicizzare direttamente. È implementata da molte classi, la più comune è `ArrayList<T>`. È iterabile.

## Set<T>

Come una lista, ma due elementi non possono essere uguali. La classe più utile che la impelementa è `HashSet<T>`. Anche queste sono iterabili.

## Map<T>

Come i dizionari di Python. Ha chiavi distinte, ciascuna assegnata a un valore. Un solo valore. Ma i valori possono essere liste, per esempio. Non si può iterare, ma c'è un metodo che ti dà una lista di chiavi e una lista di valori, e le liste sono iterabili. L'implementazione più comune sono le `HashMap<T>`, che utilizzano il principio delle hash per evitare che ci siano chiavi duplicate.