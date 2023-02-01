package oo.heranca.dasafio.dois;

public class bicicleta {
	
	int veloTotal;
	
	void Pedalar() {
		
		veloTotal += 5;
	}
	
	void freiar() {
		
	  if(veloTotal >= 5) {
			
		veloTotal -= 5;
	}
	  
}
	
	public String toString() {
		
		return "Velocidade da bicicleta: " + veloTotal + "m/s";
	}
}