package app;

import model.creature.*;
import model.item.*;

public class App
{
	public static void main(String[] args)
	{
		Hero hero01 = new Hero("Gladiador", 0);
		Monster monster01 = new Monster("Gosmento", 20, 15, 1, 7000);
		
		Ak47 ak47 = new Ak47("Ak47", 50);
		
		hero01.setWeapon(ak47);
		
		while (monster01.getHp() > 0)
		{
			hero01.attack(monster01);
			System.out.println("----------");
		}
	}
}
