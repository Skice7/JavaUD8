package ejercicio2;
/* 

@author V�ctor Castillo

*/
public class Main {
	public static void main(String[] args) {
		
		Password contrase�a = new Password();
		Password contrase�a2 = new Password(8);
		
		System.out.println(contrase�a.toString());
		System.out.println(contrase�a2.toString());
		
	}
}
