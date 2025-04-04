public class TestPersona{
	public static void main(String[] args){

		
		// ESERCIZIO 1
		Persona persona1 = new Persona("Alessandro", "Pani", 23);
		System.out.println("--- Persona 1 ---");
		System.out.println("Nome: " + persona1.getNome());
		System.out.println("Cognome: " + persona1.getCognome());
		System.out.println("Eta: " + persona1.getEta());

            
		Persona persona2 = new Persona();
		System.out.println("\n--- Persona 2 ---");
		System.out.println("Nome: " + persona2.getNome());
		System.out.println("Cognome: " + persona2.getCognome());
		System.out.println("Eta: " + persona2.getEta());

            
		Studente studente1 = new Studente();
		System.out.println("--- Studente 1 ---");
		System.out.println("Nome: " + studente1.getNome());
		System.out.println("Cognome: " + studente1.getCognome());
		System.out.println("Eta: " + studente1.getEta());
		System.out.println("Matricola: " + studente1.getMatricola());
		System.out.println("Anno iscrizione: " + studente1.getAnnoIscrizione());
		
		
            
		Studente studente2 = new Studente("Davide", "Mura", 27, 65253, 2025);
		System.out.println("--- Studente 2 ---");
		System.out.println("Nome: " + studente2.getNome());
		System.out.println("Cognome: " + studente2.getCognome());
		System.out.println("Eta: " + studente2.getEta());
		System.out.println("Matricola: " + studente2.getMatricola());
		System.out.println("Anno iscrizione: " + studente2.getAnnoIscrizione());

            
		Docente docente1 = new Docente();
		System.out.println("--- Docente 1 ---");
		System.out.println("Nome: " + docente1.getNome());
		System.out.println("Cognome: " + docente1.getCognome());
		System.out.println("Eta: " + docente1.getEta());
		System.out.println("Insegnamento: " + docente1.getInsegnamento());
            
            
		Docente docente2 = new Docente("Maurizio", "Atzori", 46, "Programmazione 2");
		System.out.println("--- Docente 2 ---");
		System.out.println("Nome: " + docente2.getNome());
		System.out.println("Cognome: " + docente2.getCognome());
		System.out.println("Eta: " + docente2.getEta());
		System.out.println("Insegnamento: " + docente2.getInsegnamento());
            	
		// ESERCIZIO 2
		persona1 = new Persona("Luca", "Zedda", 25);
		persona2 = new Persona("Mario", "Figus", 54);
		Persona persona3 = new Persona("Daniela", "Mura", 75);
		
		studente1 = new Studente("Federico", "Meloni", 26, 65243, 2020);
		studente2 = new Studente("Carla", "Garau", 32, 65842, 2023);
		Studente studente3 = new Studente("Andrea", "Puxeddu", 37, 66122, 2018);

		Docente docente = new Docente("Gianluca", "Porcu", 59, "Computer Vision");
		double costoBigliettoIntero = 100;
		
		System.out.println("Costo Biglietto per la persona1: " + persona1.calcolaCostoBiglietto(costoBigliettoIntero));
		System.out.println("Costo Biglietto per la persona2: " + persona2.calcolaCostoBiglietto(costoBigliettoIntero));
		System.out.println("Costo Biglietto per la persona3: " + persona3.calcolaCostoBiglietto(costoBigliettoIntero));
		
		System.out.println("Costo Biglietto per lo studente1: " + studente1.calcolaCostoBiglietto(costoBigliettoIntero));
		System.out.println("Costo Biglietto per lo studente2: " + studente2.calcolaCostoBiglietto(costoBigliettoIntero));
		System.out.println("Costo Biglietto per lo studente3: " + studente3.calcolaCostoBiglietto(costoBigliettoIntero));

		System.out.println("Costo Biglietto per il docente: " + docente.calcolaCostoBiglietto(costoBigliettoIntero));
		
		
            
		// ESERCIZIO 3
		
		/*

		//ESERCIZIO 4
		Persona persona = new Persona("Luca", "Zedda", 25);
		System.out.println(persona);
            
		studente = new Studente("Federico", "Meloni", 26, 65231, 2020);
		System.out.println(studente);
		
	      docente = new Docente("Gianluca", "Porcu", 59, "Computer Vision");
		System.out.println(docente);
		
           */

	}


}
