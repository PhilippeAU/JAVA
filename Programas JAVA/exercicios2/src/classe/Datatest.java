package classe;

public class Datatest {
	
	public static void main(String[] args) {
		
	Data d1 = new Data();
	
	Data d2 = new Data(01,12,2000);
	/*d2.dia = 01;
	  d2.mes = 12;
	  d2.ano = 2000;*/
	
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
			
	}
}
