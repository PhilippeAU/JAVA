package model.creature;

public class NPC extends Creature
{
	private String quest;
	
	public NPC(String name)
	{
		this.name = name;
	}

	public String getQuest()
	{
		return quest;
	}

	public void setQuest(String quest)
	{
		this.quest = quest;
	}
}
