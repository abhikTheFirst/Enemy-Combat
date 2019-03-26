public abstract class Item implements Sellable {
	/*
	 * All items have a name, rarity, and amount of uses (consumables like brews have one use, but
	 * weapons can be used multiple times before they break, like Breath of the Wild. If selling
	 * items is added, they have a sell price (determined by rarity and modifiers).
	 * 
	 * GENERAL PROPERTIES FOR ITEMS:
	 * v v v v v v v v v v v v v v v v v v
	 * Rarity -- all items have a rarity ranging from Common to Rare to Mystic
	 * Sell price -- as Item implements Sellable, they can all be sold by removing it from the
	 * inventory and adding to the player's balance the item's getSellPrice().
	 * Item description -- only to be used by the non-abstract classes. Should return a String
	 * composing of general qualities of the item that would be useful to the player in determining
	 * its usefulness.
	 * 
	 * 
	 * HOW TO CONSTRUCT AN ITEM (WEAPON):
	 * v v v v v v v v v v v v v v v v v v
	 * Note: minimum and maximum amount from drops passed to constructor is always 1, since you can't
	 * obtain more than 1 weapon from a drop. 
	 * The sell price is determined in the MeleeWeapon class itself that is factored by rarity, modifier, etc.
	 *
	 * If we wanted to make the starting "stick" weapon the default weapon (or any weapon) it would be constructed as a:
	 * new Weapon("Stick", "Common", 20, 1, 0.25, 4, 50, 65), in which the values are as follows:
	 * 
	 * "Stick" is the name of the weapon
	 * "Common" is the rarity of the weapon
	 * 20 is the amount of uses
	 * 1 is the weight of the weapon
	 * 0.25 is the weapon's base damage
	 * 4 is the critical hit chance (%)
	 * 50 is the loot chance from enemies (%)
	 * 65 is the accuracy (%)
	 * 
	 * WARNING: do NOT use getBaseDamage() to obtain the weapon's damage. Use getDamage() instead, which returns a double
	 * based on the modifier and base damage, to get a more accurate result.
	 * 
	 * 
	 * HOW TO CONSTRUCT AN ITEM (POTION):
	 * v v v v v v v v v v v v v v v v v v
	 * 
	 * 
	 * HOW TO CONSTRUCT AN ITEM (ARMOR):
	 * v v v v v v v v v v v v v v v v v v
	 * 
	 */
	private int uses, currentUses, weight, lootChance, minAmountDrops, maxAmountDrops;
	private String name, rarity;
	public abstract String getItemDescription();
	public abstract int getSellPrice();
	public Item(String n, String r, int u, int w, int l, int mn, int mx) {
		name = n;
		rarity = r;
		uses = u;
		weight = w;
		lootChance = l;
		minAmountDrops = mn;
		maxAmountDrops = mx;
		currentUses = uses;
	}
	public void setUses(int u) {
		uses = u;
	}
	public void setCurrentUses(int cU) {
		currentUses = cU;
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
	public void setLootChance(int l) {
		lootChance = l;
	}
	public void setMinAmountDrops(int m) {
		minAmountDrops = m;
	}
	public void setMaxAmountDrops(int m) {
		maxAmountDrops = m;
	}
	public int getUses() {
		return uses;
	}
	public int getCurrentUses() {
		return currentUses;
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
	public int getLootChance() {
		return lootChance;
	}
	public int getMinAmountDrops() {
		return minAmountDrops;
	}
	public int getMaxAmountDrops() {
		return maxAmountDrops;
	}
}