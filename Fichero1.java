import java.util.Scanner;

public class Fichero1 {
	
	public static void main(String[] Args) {
		
		System.out.println("Fichero1");
		System.out.println("Testing");
		System.out.println("Test Branch");
		
		Scanner read = new Scanner(System.in);
		int opcion;

		//Bucle de test
		do {

			System.out.println("Introduzca 0 para terminar el programa, de lo contrario este continuará.");
			opcion=read.nextInt();

		} while (opcion!=0);

		read.close();

		System.out.println("Adiós");
		
	}
	
}