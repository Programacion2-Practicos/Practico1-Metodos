package ejer1;
import java.util.Scanner;

public class Programa {
	
	Scanner entrada=new Scanner(System.in);
	String apellido;
	int cedula, edad;
	double altura;
	
	public void iniciar() {
		cargar();
		imprimir();
		
	}//fin iniciar

	private void imprimir() {
		System.out.println("Apellido:"+apellido);
		System.out.println("Edad: "+edad);
		System.out.println("Altura:"+altura);
		System.out.println("Cedula: "+cedula);
		
	}

	private void cargar() {
				
		System.out.println("Ingrese apellido: ");
		apellido=entrada.nextLine();
		System.out.println("Ingrese cedula: ");
		cedula=entrada.nextInt();
		System.out.println("Ingrese edad: ");
		edad=entrada.nextInt();
		System.out.println("Ingrese altura: ");
		altura=entrada.nextDouble();		
		
	}
	
	
	
	
}
