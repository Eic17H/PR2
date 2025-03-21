class Cliente {
	private String nome;
	private String cognome;
	private ContoCorrente[] contoCorrente;
	
	public Cliente(String nome, String cognome, String numeroDiConto){
		this.nome = new String(nome);
		this.cognome = new String(cognome);
		this.contoCorrente = new ContoCorrente[];
		this.contoCorrente[0] = new ContoCorrente(numeroDiconto);
	}
	
	public Cliente(){
		this.nome = new String("");
		this.cognome = new String("");
		this.contoCorrente = new ContoCorrente();
	}
	
	public Cliente(Cliente originale){
		this.nome = originale.nome;
		this.cognome = originale.cognome;
		this.contoCorrente = originale.contoCorrente;
	}
	
	public void visualizzaNome(){
		System.out.println("Nome: "+ this.nome);
	}
	public void visualizzaCognome(){
		System.out.println("Cognome: "+ this.cognome);
	}
	public void visualizzaSaldo(){
		this.contoCorrente.visualizzaSaldo();
	}
	public void visualizzaNumeroDiConto(){
		this.contoCorrente.vosializzaNumeroDiConto();
	}
	public void visualizzaConto(){
		System.out.println("Conto:")
		this.contoCorrente.visualizzaSaldo();
		this.contoCorrente.vosializzaNumeroDiConto();
	}
	public void visualizzaDati(){
		this.visualizzaNome();
		this.visualizzaCognome();
		this.visualizzaConto();
	}
}
