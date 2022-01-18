package Ejercicio3;

/* 

@author Víctor Castillo

*/
public class Electrodomesticos {
	

	
	private final static double preciobase_default = 100;
	private final static Colores color_default =Colores.blanco;
	private final static Consumos ConsumoEnergetico_default =Consumos.F;
	private final static double peso_default = 5;
	
	private  double precioBase;
	private  Colores color;
	private  Consumos consumoenergetico;
	private  double peso;


	public Electrodomesticos(){
		this.precioBase = preciobase_default;
		this.color=color_default;
		this.consumoenergetico=ConsumoEnergetico_default;
		this.peso=peso_default;
		
	}

	public Electrodomesticos(double precioBase, double peso){
		this.precioBase = precioBase;
		this.color=color_default;
		this.consumoenergetico=ConsumoEnergetico_default;
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