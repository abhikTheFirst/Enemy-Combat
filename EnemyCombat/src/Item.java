
public abstract class Item implements Sellable {
	/*
	 * All items have a name, rarity, and amount of uses (consumables like brews have one use, but
	 * weapons can be used multiple times before they break, like Breath of the Wild. If selling
	 * items is added, they have a sell price (determined by rarity and modifiers).
	 */
	private int uses, weight;
	private String name, rarity;
	public abstract String getItemDescription();
	public abstract int getSellPrice();
	public Item(String n, String r, int u, int w) {
		name = n;
		rarity = r;
		uses = u;
		weight = w;
	}
	public void setUses(int u) {
		uses = u;
	}
	public void setWeight(int w) {
		weight = w;
	}
	public void setName(String n) {
		name = n;
	}
	public void setRarity(String r) {
		rarity = r;
	}
	public int getUses() {
		return uses;
	}
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public String getRarity() {
		return rarity;
	}
}