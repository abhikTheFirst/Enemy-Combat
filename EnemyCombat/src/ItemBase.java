<<<<<<< HEAD
=======
public class ItemBase{
private double lootChance;
private int value;
private String name;
private int minNum;
private int maxNum;
>>>>>>> refs/remotes/origin/Item

<<<<<<< HEAD
public class ItemBase {
	public static void main(String[] args) {
		// Constructing item tests aka temporary runner for testing things
	  	Shortsword s = new Shortsword("Sword", "Rare", 30, 30, 7.0, 4);
		System.out.println("Total damage: " + s.getDamage());
		System.out.println("Base damage: " + s.getBaseDamage());
		System.out.println("(" + (100 + s.getModifier().getModifierEffect()) + "% damage)");
		System.out.println(s.getModifier().getModifierName() + " shortsword");
		System.out.println("Can be sold for: " + s.getSellPrice());
	}
}
=======
  public double getLootChance()
  {
    return lootChance;
  }

  public void setLootChance(double l)
  {
    lootChance = l;
  }

  public int getValue()
  {
    return value;
  }

  public void setValue(int v)
  {
     value = v;
  }

  public String getName()
  {
    return name;
  }

  public void setName()
  {
    name = n;
  }

  public int getMinNum()
  {
    return minNum;
  }

  public void setMinNum(int m)
  {
    minNum = m;
  }

  public int getMaxNum()
  {
    return maxNum;
  }

  public void setMaxNum(int m)
  {
    maxNum = m;
  }
}
>>>>>>> refs/remotes/origin/Item
