package arrays;

public class testenome {
	
	public static void main(String[] args) {
		
		String nome[] = new String[8];
		nome [0] = "P";
		nome [1] = "h";
		nome [2] = "i";
		nome [3] = "l";
		nome [4] = "i";
		nome [5] = "p";
		nome [6] = "p";
		nome [7] = "e";
		
		for(int i = 7; i > nome.length; i++) {
			
			System.out.print(nome[i]);
		}
	}

}
