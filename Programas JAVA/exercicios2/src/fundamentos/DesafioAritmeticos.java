package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int a = 2 * 4 - 10;
		int b = (int) Math.pow(a, 3);
		
		System.out.println(b);
		
		
		int x = (6*(3+2));
		int xp = (int) Math.pow(x,2);
		int xpd = (xp / 6);
		
		int y = ((-4) * (-5));
		int yp = (int) Math.pow(y, 2);
		int ypd = (yp / 2);
		
		int p = 10;
		int pp = (int) Math.pow(p, 3);
		
		int menos = (xpd - ypd);
		int menosp = (int) Math.pow(menos, 3);
		int menospd = (menosp / pp);
		
		System.out.println(menospd);
		
		
	} 

}
 