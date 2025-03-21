class ContoCorrente {
	private String numeroDiConto;
	private double saldo;
	
	public ContoCorrente(){
		this.numeroDiConto = new String("");
		this.saldo = 0;
	}
	
	public ContoCorrente(String numeroDiConto){
		this.numeroDiConto = new String(numeroDiConto);
		this.saldo = 0;
	}
	
	public ContoCorrente(String numeroDiConto, double saldo){
		this.numeroDiConto = new String(numeroDiConto);
		this.saldo = saldo;
	}
	
	public ContoCorrente(double saldo){
		this.numeroDiConto = new String("");
		this.saldo = saldo;
	}
	
	public void deposita(double qtt){
		if(qtt>0)
			this.saldo += qtt;
	}
	public void preleva(double qtt){
		if(qtt>0 || this.saldo-qtt>0)
			this.saldo -= qtt;
	}
	public void visualizzaSaldo(){
		System.out.println("Saldo: "+ this.saldo);
	}
	public void visualizzaNumeroDiConto(){
		System.out.println("Numero di conto: "+ this.numeroDiConto);
	}
}
