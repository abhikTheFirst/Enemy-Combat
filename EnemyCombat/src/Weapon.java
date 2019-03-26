public class Weapon extends Item implements Modifiable, Sellable {
	private double baseDamage;
	private int criticalChance, randomIndex, modifierEffect, accuracy;
	public String modifierName;
	public Weapon(String n, String r, int u, int w, double bD, int c, int l, int a) {
		super(n, r, u, w, l, 1, 1);
		baseDamage = bD;
		randomIndex = (int)(Math.random() * POSSIBLE_MODIFIER_EFFECTS.length);
		criticalChance = c;
		modifierName = POSSIBLE_MODIFIER_NAMES[randomIndex];
		modifierEffect = POSSIBLE_MODIFIER_EFFECTS[randomIndex];
		accuracy = a;
	}
	public String getItemDescription() {
		/*
		 * Item description when printed follows this format (example):
		 * 
		 * WEAPON: SUPERIOR LONGBOW
		 * RARITY: COMMON
		 * DAMAGE: 15.05
		 * CRITICAL STRIKE CHANCE: 4%
		 * ACCURACY: 75%
		 * USES: 24/100
		 * 
		 */
		return "WEAPON: " + modifierName.toUpperCase() + " " + super.getName().toUpperCase() + "\nRARITY: " + super.getRarity()
		+ "\nDAMAGE: " + getDamage() + "\nCRITICAL STRIKE CHANCE: " + criticalChance + "%\nACCURACY: " + accuracy + "%"
		+ "\nUSES: " + super.getCurrentUses() + "/" + super.getUses() + " (" + (int)(super.getCurrentUses() / super.getUses()) + " %)";
	}
	public void reforge() {
		/*
		 * Reforging a weapon is the same as rerolling its modifiers. If someone doesn't like the modifier that it has then they can
		 * reroll and get a new one. Would cost something.
		 */
		randomIndex = (int)(Math.random() * POSSIBLE_MODIFIER_EFFECTS.length);
		modifierName = POSSIBLE_MODIFIER_NAMES[randomIndex];
		modifierEffect = POSSIBLE_MODIFIER_EFFECTS[randomIndex];
	}
	public int getSellPrice() {
		/*
		 * A weapon's sell price is based on its rarity, modifier and base damage - this way valuable, rare and good weapons
		 * have a better sell price than crappy early-game ones. If selling is added then this is how many currency units (the return value)
		 * the thing will go for.
		 * Weight: 50% of price determined by base damage, 25% determined by rarity, 25% determined by modifier.
		 */
		double rarValue;
		switch(super.getRarity()) {
			case "Common":
				rarValue = 1;
				break;
			case "Uncommon":
				rarValue = 1.15;
				break;
			case "Rare":
				rarValue = 1.25;
				break;
			case "Mythic":
				rarValue = 1.5;
				break;
			default:
				rarValue = 1;
				break;
		}
		return (int)(rarValue * 50) + (int)(baseDamage * 100) + (int)(modifierEffect * 50);
	}
	public double getDamage() {
		return baseDamage + (baseDamage * 0.01 * modifierEffect);
	}
	public String getModifierDescription() {
		if(modifierEffect > 0) {
			return modifierName + "weapon: " + "+" + modifierEffect + "% damage";
		}
		return modifierName + " weapon: " + "-" + modifierEffect + "% damage";
	}
	
	public void setAccuracy(int a) {
		accuracy = a;
	}
	public void setBaseDamage(double bD) {
		baseDamage = bD;
	}
	public void setCriticalChance(int c) {
		criticalChance = c;
	}
	public void setModifierEffect(int mE) {
		modifierEffect = mE;
	}
	public void setModiferName(String mN) { 
		modifierName = mN;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public double getBaseDamage() {
		return baseDamage;
	}
	public int getCriticalChance() {
		return criticalChance;
	}
	public int getModifierEffect() {
		return modifierEffect;
	}
	public String getModifierName() {
		return modifierName;
	}
}