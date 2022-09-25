package model.item;

public class HavaianaOfStick extends Weapon
{
	public HavaianaOfStick(String name, int power)
	{
		super(name, power);
	}

	@Override
	public void attack()
	{
		System.out.println("I have broked your bones XD" );
	}
}
