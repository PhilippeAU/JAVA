package oo.heranca.dasafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	double veloAtual;
	
	Carro(int velocidadeMaxima){
		
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		
		if(veloAtual + 5 > VELOCIDADE_MAXIMA) {
			
			veloAtual = VELOCIDADE_MAXIMA;
		}else {
			
		veloAtual += 5;
		}	
}
	void freiar() {
		
		if(veloAtual >= 5) {
		veloAtual -= 5;
		
		}else {
			
			veloAtual = 0;
		}
	}
	
	public String toString() {
		
		return "Velocidade Atual: " + veloAtual + "Km/h";
	}
}
