class Programma{
	public static void main(String[] args){
		System.out.println("esecuzione del mio primo programma Java");
		String s = new String("nero");
		System.out.println(s);
		Monitor monitor1 = new Monitor(1920, 1080, s);
		System.out.println("Il monitor ha risoluzione " + monitor1.risOriz + "x" + monitor1.risVert + " ed è " + s + ".");
	}
}
