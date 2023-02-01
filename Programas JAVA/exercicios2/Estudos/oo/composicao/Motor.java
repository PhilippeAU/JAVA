package oo.composicao;

public class Motor {
	
	Carro carro;
	boolean ligado = false;
	double fatorInjencao = 1;
	 
	Motor(Carro carro){
		
		this.carro = carro;
	}
	
	int giros() {
		
		if(!ligado) {
			
			return 0;
		}else {
			return (int) Math.round(fatorInjencao * 3000);
	
		}
	}
}                 