Quinta esercitazione

Non abbiamo visto il metodo `equals()` a lezione di teoria, ma era pianificata per oggi.
Inoltre, `static` ed eccezioni.
Il solito: classi, test main, eccetera.

# `equals()`

`class Persona` ha implicito `extends Object`.
`Object` has i metodi `toString()`, `equals()` e `clone()`.
* `toString()` di default restituisce il nome della classe seguito dall'indirizzo, ma di solito si fa l'override per mostrare gli attributi.
* `equals()` è l'equivalente in C di `==`. La differenza è che permette di confrontare due oggetti della stessa classe, concetti non presenti in C. Deve rispettare certe proprietà:
    * Riflessività - `x.equals(x)`
    * Simmetrie - `x.equals(y)` → `y.equals(x)`
    * Transitività - `x.equals(y) && y.equals(z)` → `x.equals(z)`
    * `!x.equals(null)`

Vedi le #slide per le varie cose insomma si capisce.

# Variabili statiche

Certe volte le varibili si riferiscono a una classe intera, anziché a un oggetto. Con la keyword `static`, una variabile che fa parte di una classe, anziché avere un'istanza per ciascun oggetto, è un'unica variabile per l'intera classe, condivisa da tutte le istanze della classe. Per questo motivo, sono dette anche *variabili di classe*.

La memoria di Java è come uno stack:
[oggetto]  [oggetto] [oggetto]  [oggetto] [oggetto]  [oggetto] 
[ ---- classe ---- ] [ ---- classe ---- ] [ ---- classe ---- ]
[ variabili statiche che appartengono a tutti e sono globali ]

Allo stesso modo, i metodi statici possono essere chiamati non tramite un oggetto, ma direttamente tramite la classe: `Math.sqrt()`. Non c'è bisogno di `new`.

# Eccezioni

In generale, quando succede un errore che non abbiamo previsto, in C c'è `segmentation fault`, quindi il programma crasha e dobbiamo ricominciare. In Java invece, esistono le eccezioni, lanciate dai metodi, che possono essere catturate e gestite.

Dico a Java: questo metodo è rischioso, posso dover lanciare un'eccezione, quindi può essere opportuno gestirlo oppure no. Lo si gestisce con try/catch: prova a fare qualcosa, e se lancia un'eccezione, catturala e gestiscila.

Gli errori non sono i bug. I bug esistono, generalmente per negligenza del programmatore, ma gli errori sono qualcosa con cui dobbiamo convivere. Se l'utente immette qualcosa che non dovrebbe, non possiamo farci niente. Tutto ciò che possiamo fare è gestire questi casi.

Ci sono due tipi di errori: checked e unchecked. Gli errori checked sono controllati a tempo di compilazione, non si può sbagliare. Se si compila e c'è un errore, non compila proprio. Per esempio, `ClassNotFound`. Quelle su cui invece bisogna lavorare sono quelle unchecked, quelle a runtime. Per esempio, per caso, un divisore è $0$. Non ci possiamo fare niente, può succedere per il caso, o per un input.

C'è anche `throw`.
```
public void verificaEta(int eta) throws IllegalArgumentException{
    if(eta < 18){
        throw new IllegalArgumentException("Accesso negato.");
    }
    System.out.println("Accesso consentito.");
}
```
Quando viene lanciata l'eccezione, viene terminata l'esecuzione del metodo. Questo metodo lancia l'eccezione, e il metodo chiamante decide se catturarla o lanciarla a sua volta. Vedi #slide 20.

I catch vanno a cascata. È come un if/else. Mettili in ordine dal più particolare al più generale.

C'è un'altra keyword, `finally`. Questo blocco verrà **sempre** eseguito. Ci metti, per esempio, `out.close()`.

Posso anche creare nuove classi che corrispondono a nuove eccezioni.

# Altro

`Integer` è una classe *wrapper*. Con `Integer.parseInt()` trasformo una stringa in un intero.
Per farti stampare gli assert non passati, fai `java -ea NomeClasse`.
Non puoi fare `equals()` coi tipi primitivi.