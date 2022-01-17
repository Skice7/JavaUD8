package Ejercicio3;

/* 

@author Víctor Castillo

*/
public class Electrodomesticos {
	

	
	private  double precioBase;
	private  Colores color;
	private  Consumos consumoenergetico;
	private  double peso;


	public Electrodomesticos(){
		this.precioBase = 100;
		this.color=Colores.blanco;
		this.consumoenergetico=Consumos.F;
		this.peso=5;
		
	}

	public Electrodomesticos(double precioBase, double peso){
		this.precioBase = precioBase;
		this.color=Colores.blanco;
		this.consumoenergetico=Consumos.F;
		this.peso=peso;
		
	}

	public Electrodomesticos(double precioBase,Colores color,Consumos consumoenergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoenergetico =consumoenergetico;
		this.peso = peso;
	}

	
	public String toString() {
		return "Electrodomesticos [precioBase=" + precioBase + ", color=" + color + ", consumoenergetico="
				+ consumoenergetico + ", peso=" + peso + "]";
	}

	
}