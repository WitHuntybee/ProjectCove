package projectCove;
/*
 * Hunter Baldwin This class handles the weapons in the game. This includes the
 * damage they deal and the name.
 */

import java.util.Random;

public class Weapon
{
	private String name;
	private String type;
	private int minDamage;
	private int maxDamage;
	private final String[] NAME_PREFIX = { "The Illustrious", "The Menacing", "The Gargantuan", "The Spiky",
			"The Hardened", "The Stabby", "The Sharp" };
	private final String[] WEAPON_TYPE = { "Shortsword", "Longsword", "Dagger", "Axe", "Hammer", "Stick" };
	private final String[] NAME_SUFFIX = { "of Killing", "of Enchantment", "of DEATH", "of Power",
			"of Stupendous Strength", "of The Deep", "of Music", "of Wacky Things", "of 'It Works'" };

	/*** Creates a randomized weapon with 1 minimum damage and 3 maximum damage. */
	public Weapon()
	{
		randomize(1, 3);
	}

	/***
	 * Creates a new weapon with a randomized name and a randomized damage with a
	 * max of your choice.
	 */
	public Weapon(int minDamage, int maxDamage)
	{
		randomize(minDamage, maxDamage);
	}

	/***
	 * Create a weapon with a name of your choice and randomized max and min damage
	 * of your choice.
	 */
	public Weapon(String name, String type, int minDamage, int maxDamage)
	{
		this.name = name;
		this.type = type;
		randomize(minDamage, maxDamage);
	}

	/***
	 * Randomizes the weapons name and damage with max damage values of your choice.
	 */
	public void randomize(int minModifier, int maxModifier)
	{
		Random rand = new Random();
		type = WEAPON_TYPE[rand.nextInt(WEAPON_TYPE.length)];
		name = NAME_PREFIX[rand.nextInt(NAME_PREFIX.length)] + " " + type + " "
				+ NAME_SUFFIX[rand.nextInt(NAME_SUFFIX.length)];
		minDamage = rand.nextInt(minModifier) + 1;
		maxDamage = rand.nextInt(maxModifier - minModifier + 1) + minModifier;
	}

	public String getName()
	{
		return name;
	}

	public String getType()
	{
		return type;
	}

	public int getMinDamage()
	{
		return minDamage;
	}

	public int getMaxDamage()
	{
		return maxDamage;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setMinDamage(int minDamage)
	{
		this.minDamage = minDamage;
	}

	public void setMaxDamage(int maxDamage)
	{
		this.maxDamage = maxDamage;
	}

	@Override
	public String toString()
	{
		return "Weapon [name=" + name + ", type=" + type + ", minDamage=" + minDamage + ", maxDamage=" + maxDamage
				+ "]";
	}

}
