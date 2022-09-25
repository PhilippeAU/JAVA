package model.creature;

import engine.Level;
import model.item.Weapon;

public class Hero extends Creature
{
	private int xp;
	private int level;
	private Weapon weapon;
	
	public Hero(String name, int xp)
	{
		this.name = name;
		this.xp = xp;
		checkLevelUp();
	}
	
	@Override
	public void attack(Creature target)
	{
		weapon.attack();
		super.attack(target);
	}

	public void addXp(int xp) {
		this.xp += xp;
		checkLevelUp();
	}
	
	private void checkLevelUp() {
		int levelTemp = 1;
		for (int i = 1; i < Level.list.length; i++)
		{
			if (xp >= Level.list[i]) {
				levelTemp = i + 1;
			} else {
				break;
			}
		}
		level = levelTemp;
		System.out.println(name + " is level " + level);
		updateAttributes();
	}
	
	private void updateAttributes() {
		hp = 100 * level;
		powerAttack = 10 * level;
		defense = 8 * level;
	}

	public Weapon getWeapon()
	{
		return weapon;
	}

	public void setWeapon(Weapon weapon)
	{
		this.weapon = weapon;
	}
}
