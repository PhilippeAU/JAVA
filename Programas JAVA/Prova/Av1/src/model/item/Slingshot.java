package model.item;

public class Slingshot extends Weapon
{
	public Slingshot(String name, int power)
	{
		super(name, power);
	}

	@Override
	public void attack()
	{
		System.out.println("Fire a stone in your head! ahahaha!");
	}

}
