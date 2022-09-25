package model.item;

public abstract class Weapon
{
	private String name;
	private int power;
	
	public Weapon(String name, int power)
	{
		this.name = name;
		this.power = power;
	}
	
	public abstract void attack();

	public String getName()
	{
		return name;
	}

	public int getPower()
	{
		return power;
	}
}
