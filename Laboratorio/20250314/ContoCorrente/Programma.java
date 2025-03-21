class Programma{		
	public static void main(String[] args){
		Cliente cliente = new Cliente("Tizio", "Caio", "314271424");
		cliente.visualizzaNome();
		cliente.visualizzaCognome();
		cliente.visualizzaSaldo();
		System.out.println("Aumento del saldo di 100");
		cliente.contoCorrente.deposita(100);
		cliente.visualizzaDati();
	}
}
