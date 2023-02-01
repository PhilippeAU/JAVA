package oo.heranca.dasafio.tres;

public class familia {
	
	int idade;
	String nome;
	
	 familia(int idade, String nome){
		
		this.idade = idade;
		this.nome = nome;
	}
	
	public String toString() {
		
		return "O nome: " + nome 
		+ "\nA idade:" + idade; 
	}

}
