package fundamentos;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\" ? " + comprouTv50);  // \" <<< O Print ler como aspas
		System.out.println("Comprou TV 52\" ? " + comprouTv32); 
		System.out.println("Comprou sorvete\" ? " + comprouSorvete); 
		
		System.out.println("Mais Saudável? " + maisSaudavel);
		
	}

}
