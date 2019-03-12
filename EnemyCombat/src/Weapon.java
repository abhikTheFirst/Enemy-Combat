public abstract class Weapon extends Item implements Modifiable {
	private double baseDamage;
	private Modifier mod;
	private int criticalChance, randomIndex;
	public Weapon(String n, String r, int u, int w, double bD, int c) {
		super(n, r, u, w);
		baseDamage = bD;
		randomIndex = (int)(Math.random() * POSSIBLE_MODIFIER_EFFECTS.length);
		criticalChance = c;
	}
	public String getName() {
		return mod.getModifierName() + " " + super.getName();
	}
	public void reforge() {
		mod = new Modifier();
	}
	public double getDamage() {
		return baseDamage + (baseDamage * 0.01 * mod.getModifierEffect());
	}
	public Modifier getModifier() {
		return mod;
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
	public void setModifier(Modifier m) {
		mod = m;
	}
	public String getModifierDescription() {
		return "a";
	}
	public void test() {
		System.out.println(POSSIBLE_MODIFIER_NAMES[0]);
	}
}