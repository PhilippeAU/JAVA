package model.creature;

public abstract class Creature
{
	protected String name;
	protected int hp;
	protected int powerAttack;
	protected int defense;
	protected boolean isAlive = true;

	public void attack(Creature target)
	{
		if (target instanceof NPC)
		{
			System.out.println("NPCs não podem ser atacados, se comporte!");
		}
		else
		{
			System.out.println(name + " has attacked " + target.name);
			target.hitted(this);
		}
	}

	public void hitted(Creature attacker)
	{
		if (!isAlive)
		{
			System.out.println(name + " is already dead");
			return;
		}

		int damageTaked = attacker.powerAttack - defense;
		if (damageTaked < 0)
			damageTaked = 0;
		hp -= damageTaked;

		System.out.println(name + " takes " + damageTaked + " of damage by " + attacker.name);
		System.out.println(name + " has " + hp + " of HP");

		if (hp <= 0)
		{
			isAlive = false;
			System.out.println(name + " says 'Oh, no! I'm dead!'");
		}
	}
}
