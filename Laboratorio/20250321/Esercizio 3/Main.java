public class Main{
    public static void main(String[] args){
        Persona persona = new Studente("Aldo", "Baglio", 20, 66123, 1999);
        System.out.println(persona.calcolaCostoBiglietto(100));
        Studente studente = (Studente) persona;
        System.out.println(studente.calcolaCostoBiglietto(100));
    }
}