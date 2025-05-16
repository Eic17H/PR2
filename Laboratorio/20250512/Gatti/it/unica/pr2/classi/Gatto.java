package it.unica.pr2.classi;

public class Gatto{
	private String nome;
	private Double coda;
	
	public Gatto(String nome, Double coda){
		this.nome = nome;
		this.coda = coda;
	}
	
	public String getNome(){
		return this.nome;
	}

	public Double getCoda(){
		return this.coda;
	}

	@Override
	public String toString(){
		return "" + this.nome + ": " + this.coda;
	}
}
