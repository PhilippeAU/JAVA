package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data (){
		
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data (int diaN,int mesN, int anoN){
		
		dia = diaN;
		mes = mesN;
		ano = anoN;	
	}
	
	String obterDataFormatada(){
		
		return String.format("%d/%d/%d",dia,mes,ano);
	}
}
