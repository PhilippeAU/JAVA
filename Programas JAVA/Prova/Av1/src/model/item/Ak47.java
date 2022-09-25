package model.item;

public class Ak47 extends Weapon
{
	public Ak47(String name, int power)
	{
		super(name, power);
	}

	@Override
	public void attack()
	{
		System.out.println("Shot many bullets in your ass!" );
	}
}
