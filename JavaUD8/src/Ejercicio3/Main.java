package Ejercicio3;

/* 

@author Víctor Castillo

*/

public class Main {

	public static void main(String[] args) {

		Electrodomesticos electrodomesticos1 = new Electrodomesticos();
		Electrodomesticos electrodomesticos2 = new Electrodomesticos(150, 8);
		Electrodomesticos electrodomesticos3 = new Electrodomesticos(130,Colores.azul,Consumos.D,20);
		
		System.out.println(electrodomesticos1.toString());
		System.out.println(electrodomesticos2.toString());
		System.out.println(electrodomesticos3.toString());

	}

}
