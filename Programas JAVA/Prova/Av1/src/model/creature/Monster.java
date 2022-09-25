package model.creature;

public class Monster extends Creature
{
	private int xpReward;
	private boolean alreadyXpReward;
	
	public Monster(String name, int hp, int powerAttack, int defense, int xpReward)
	{
		this.name = name;
		this.hp = hp;
		this.powerAttack = powerAttack;
		this.defense = defense;
		this.xpReward = xpReward;
	}
	
	@Override
	public void hitted(Creature attacker)
	{
		super.hitted(attacker);
		if (alreadyXpReward || isAlive)
			return;
		Hero hero = (Hero) attacker;
		if(hero != null) {
			hero.addXp(xpReward);
			System.out.println(attacker.name + " receives " + xpReward + " of XP");
		}
		alreadyXpReward = true;
	}
	
	public int getHp() {
		return hp;
	}
}
