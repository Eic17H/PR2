class Monitor{
	int risOriz;
	int risVert;
	String colore;
	boolean acceso;
	
	Monitor(int risOriz, int risVert, String colore){
		this.risOriz = risOriz;
		this.risVert = risVert;
		this.colore = colore;
		this.acceso = false;
	}
	
	void tastoPower() {
		this.acceso = !(this.acceso);
	}
}
