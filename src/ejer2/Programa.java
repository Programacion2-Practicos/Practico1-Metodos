package ejer2;
import java.util.Random;
import java.util.Scanner;

public class Programa {
	
	void iniciar(){
		
		int valor=generarAleatorio();
		int num;
		String resul;
		
		do{
			num=pedirNumero();
			resul=compararNumeros(num, valor);
			System.out.println(resul);
			
		}while(!(resul.equals("igual")));
		System.out.println("Felicitaciones acertaste!!");
	}
	
	//devuelve un numero aleatorio entre 1 y 100
	int generarAleatorio(){
		//Complete aquí
	}
	
	//pide un nro por pantalla
	 int pedirNumero(){
		 
		//Complete aquí
		 
	 }
	
	 //compara dos enteros a y b. Devuelve un String indicando si es menor, mayor o igual
	 String compararNumeros(int a, int b){
		//Complete aquí
	 }
	
}
