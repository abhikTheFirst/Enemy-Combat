
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