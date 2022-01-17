package ejercicio1;
/* 

@author Víctor Castillo

*/
public class Main {

	public static void main(String[] args) {
		persona persona1=new persona("12345678N");
		persona persona2=new persona("Víctor",21,"12345678N","H");
		persona persona3=new persona("Víctor",21,"12345678N","H",80,170);
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		

	}

}
