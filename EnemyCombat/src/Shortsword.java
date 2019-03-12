
public class Shortsword extends Weapon {
	/* 
	 * Shortswords are the most basic of weapons. Their sell prices are low.
	 * Think of more characteristics of shortswords here (for instance variables):
	 * 
	 */
	public Shortsword(String n, String r, int u, int w, double bD, int c) {
		super(n, r, u, w, bD, c);
	}
	public String getItemDescription() {
		return "Shortsword";
	}
	public int getSellPrice() {
		double rarValue;
		switch(super.getRarity()) {
			case "Common":
				rarValue = 1;
				break;
			case "Rare":
				rarValue = 1.25;
				break;
			case "Mythic":
				rarValue = 1.5;
				break;
			default: // Add other types of rarities for more diverse selling
				rarValue = 1;
				break;
		}
		return 200 + (int)(5 * super.getModifier().getModifierEffect() * rarValue);
	}
}