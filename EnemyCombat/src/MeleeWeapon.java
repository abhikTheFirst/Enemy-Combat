/* SCRAPPED CLASS */
/* SCRAPPED CLASS */
/* SCRAPPED CLASS */
/*public class MeleeWeapon extends Weapon implements Modifiable, Sellable {
	//  Tomis the tank engin

	public MeleeWeapon(String n, String r, int u, int w, double bD, int c, int l) {
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
}*/