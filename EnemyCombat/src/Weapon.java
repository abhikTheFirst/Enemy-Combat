public abstract class Weapon extends Item implements Modifiable, Sellable {
	private double baseDamage;
	private int criticalChance, randomIndex, modifierEffect;
	public String modifierName;
	public Weapon(String n, String r, int u, int w, double bD, int c, int l) {
		super(n, r, u, w, l, 1, 1);
		baseDamage = bD;
		randomIndex = (int)(Math.random() * POSSIBLE_MODIFIER_EFFECTS.length);
		criticalChance = c;
		modifierName = POSSIBLE_MODIFIER_NAMES[randomIndex];
		modifierEffect = POSSIBLE_MODIFIER_EFFECTS[randomIndex];
	}
	public String getName() {
		return modifierEffect + " " + super.getName();
	}
	public void reforge() {
		randomIndex = (int)(Math.random() * POSSIBLE_MODIFIER_EFFECTS.length);
	}
	public double getDamage() {
		return baseDamage + (baseDamage * 0.01 * modifierEffect);
	}
	public void setBaseDamage(double bD) {
		baseDamage = bD;
	}
	public double getBaseDamage() {
		return baseDamage;
	}
	public void setCriticalChance(int c) {
		criticalChance = c;
	}
	public int getCriticalChance() {
		return criticalChance;
	}
	public String getModifierDescription() {
		return modifierName + " weapon: " + modifierEffect + "% damage";
	}
	public void setModifierEffect(int mE) {
		modifierEffect = mE;
	}
	public int getModifierEffect() {
		return modifierEffect;
	}
	public void setModiferName(String mN) { 
		modifierName = mN;
	}
	public String getModifierName() {
		return modifierName;
	}
}