package ejercicio1;
/* 

@author Víctor Castillo

*/
public class  persona {
	
	//Atributos
	
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private int peso;
	private int altura;
	
	
	//Constructor por defecto
	public  persona(String DNI) {
		this.nombre="";
		this.edad=0;
		this.DNI="12345678N";
		this.sexo="H";
		this.peso=0;
		this.altura=0;
	}
	
	//Constructor con  el nombre, edad y sexo, el resto por defecto.
	public  persona (String nombre, int edad,String DNI,String sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI="12345678N";
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
		
	}
	
	
	//Constructor con todos los parametros
	public  persona (String nombre, int edad, String DNI,String sexo,int peso,int altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.DNI="12345678N";
		this.sexo="H";
		this.peso=peso;
		this.altura=altura;
		
	}

	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
}
