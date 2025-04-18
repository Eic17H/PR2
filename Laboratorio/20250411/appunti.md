Sesta esercitazione, settimana #6, siamo a metà.
Un avviso: 28 Aprile e 12 Maggio... boh, vedi il gruppo WhatsApp, credo recuperari lezioni perse.
Abbiamo saltato la lezione teorica di Lunedì ma siamo abbastanza avanti quindi qui siamo a posto.
Oggi due argomenti vecchi + interfacce.
Eccezioni, classi astratte, interfacce, esercizio.
L'esercizio è difficile.

# Eccezioni

Eventi tecnicamente non previsti, ma si spera gestiti.
Certe volte, se non gestite, fanno crashare il programma.
Per lanciare un'eccezione, si usa la keyword `throw`.
In Java tutto è un oggetto, incluse le eccezioni: `throw new Eccezione()`.
Se un metodo può lanciare un'eccezione, si usa la keyword `throws` nella firma del metodo.
Quando si chiama un metodo che lancia un'eccezione, la si mette dentro un blocco `try`/`catch`.
Se non usi un blocco `try`/`catch`, usi `throws`.

Sia errori che eccezioni sono sottoclassi di `throwable`.
Ci sono throwable checked e unchecked. Quelle checked le devi gestire o rilanciare, quelle unchecked le devi evitare. Vedi le #slide.

Exception viene considerata checked, e quindi se la estendi la tua nuova classe è checked.

# Classi astratte

Una classe che contiene almeno un metodo senza implementazione (metodo astratto), o metodi concreti (con implementazione), e si usa come base per altre classi.
Non si possono istanziare oggetti di classe astratta, e le sottoclassi devono implementare i metodi.
Due forme geometriche diverse hanno entrambe il metodo calcolaArea ma con implementazione diversa.

# Interfacce

Si vedrà meglio in ISW l'anno prossimo.
Non tutti i team che collaborano per un progetto sanno di preciso cosa l'altro deve fare.
Se un cliente ti dice cosa devi fare per un progetto, le interfacce definiscono un accordo tra gruppi, in questo caso tra clienti e la software house.
L'accordo implicito è *il mio software deve avere questa caratteristica*.
Per esempio: John Ferrari ti dice che tutte le classi devono avere metodi che gestiscono i motori Ferrari.
In Java le interfacce sono delle classi, che hanno attributi `static` (globali) e `final` (costanti), con metodi pubblici senza corpo, e metodi statici implementati.

Hanno cose in comune con le classi astratte:
* Non si possono istanziare
* Possono essere *estese* da altre interfacce o *implementate* da classi: `extends` vs `implements`.
Una classe può estendere una sola classe, ma può implementare più classi.
Un'interfaccia può estendere più interfacce.
Una classe può implementare interfacce ed estendere una classe, contemporaneamente

Le interfacce si definiscono con la keyword `interface`.
I metodi sono pubblici di default. Di solito il default è package visibility.

Le interfacce permettono anche il polimorfismo.
Non ho capito un cazzo, non sembra neanche stia parlando italiano onestamente.

Vedi #slide Classi Astratte vs Interfacce.