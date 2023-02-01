package oo.heranca;

public class Jogo {


	public static void main(String[] args) {
			
		Mostro monstro = new Mostro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10,11);
		
		System.out.println("Monstro: " + monstro.vida);
		System.out.println("Héroi: " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro: " + monstro.vida);
		System.out.println("Héroi: " + heroi.vida);
			
	}
}


