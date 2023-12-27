package ejer2;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Scanner entrada = new Scanner(System.in);
				
		double num1,num2;
				
		//pedida de numeros a los usuarios
		System.out.println("Ingrese el primer numero: ");
		num1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = entrada.nextInt();
		
		//pasaje de los numeros a los metodos
		double result1 = calc.suma(num1,num2);
		
		//mostrar en pantalla
		System.out.println("El resultado de la suma es: " + result1);
	} 

}
