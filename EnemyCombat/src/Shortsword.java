public class Shortsword extends Weapon implements Modifiable, Sellable {
	/* 
	 * Shortswords are the most basic of weapons. Their sell prices are low.
	 * Think of more characteristics of shortswords here (for instance variables):
	 * 
	 * NOTE: This class is to be scrapped and replaced for a refurbished "MeleeWeapon" class, as
	 * shortswords are too specific for a simple game and don't have any different characteristics
	 * from other melee weapons (for now)
	 */
	public Shortsword(String n, String r, int u, int w, double bD, int c, int l) {
		super(n, r, u, w, bD, c, l);
		super.makeRandomIndeces();
	}
	public String getItemDescription() {
		return super.getModifierName() + " " + getName() + " (" + super.getRarity() + " item)\nDamage: " + super.getDamage();
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
		return 200 + (int)(5 * super.getModifierEffect() * rarValue); // 200 is default value for shortsword, can fluctuate based on type of weapon/how good it is
	}
}