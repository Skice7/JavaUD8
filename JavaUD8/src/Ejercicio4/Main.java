package Ejercicio4;

/* 

@author Víctor Castillo

*/

public class Main {

	public static void main(String[] args) {
		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Serie","Víctor Castillo");
		Serie serie3 = new Serie("Serie2",5,"Accion","Pepe Pepe");

		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());
		

	}

}
