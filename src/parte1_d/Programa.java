package parte1_d;

public class Programa {
	void iniciar(){
		int[] entiendo = new int[5];
		int salvar = 7;
		algo(entiendo);
		quiero(salvar);
		System.out.println(salvar);
		
	}
	
	void quiero(int x){
		x = x + 5;
		System.out.println(x);
	}
	
	void algo(int []x){
		
		for(int i = 0; i<5; i++){
			x[i] = i + i;
			System.out.print(x[i]+", ");
					
		}
		System.out.println(" ");
	} 
}


