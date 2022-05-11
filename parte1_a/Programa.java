package parte1_a;

public class Programa {
	void iniciar(){
		int a, b;
		a=2;
		b=5;
		procedimiento(a,b);
		System.out.println("el valor de a es: "+a);
		System.out.println("el valor de b es: "+b);
	}
	
	void procedimiento (int b, int a){
		System.out.println("el valor de a es: "+a);
		System.out.println("el valor de b es: "+b);
		b=a;
		
	}

}
