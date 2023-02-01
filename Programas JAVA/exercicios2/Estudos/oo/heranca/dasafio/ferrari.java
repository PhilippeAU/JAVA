package oo.heranca.dasafio;

public class ferrari extends Carro {
	
	ferrari(){
		
		this(315);
	}
	
	ferrari(int velocidadeMaxima){
		
		super(velocidadeMaxima);
	}
	
	void acelerar() {
		
		veloAtual += 15;
	}	
}
