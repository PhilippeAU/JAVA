package controle;

public class SwitchSembreak {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
			case "preta":
				System.out.println("Sei o Bassai-Dai!!!");
			case "marron":
				System.out.println("Sei o Tekki Shodan!!!");
			case "roxa":
				System.out.println("Sei o Heian Godan!!!");
			case "verde":
				System.out.println("Sei o Heian Yodan!!!");
			case "laranja":
				System.out.println("Sei o Heian Sandan");
			case "vermelha":
				System.out.println("Sei o Heian Nidan");
			case "amarela":
				System.out.println("Seo o Heian Shodan");
//			default:
//				System.out.println("N�o sei de nada!!!");
		
		}
		
		System.out.println();
		
		int idade = 3;
		switch (idade) {
		case 4:
			System.out.println("Sabe perguntar");
		case 3: 
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe engatinhar");
			
			
	}
}
}