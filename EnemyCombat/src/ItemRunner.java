import java.util.ArrayList;
public class ItemRunner {
	public static void main(String[] args) {
		// Testing some items and their statistics
		Item i = new Shortsword("Stick", "Common", 20, 1, 0.25, 4, 50);
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Shortsword("A Sword", "Rare", 70, 5, 7.5, 10, 25));
		items.add(i);
		
		for(Item x : items) {
			System.out.println("sells for: " + x.getSellPrice());
			System.out.println("loot chance: " + x.getLootChance());
			System.out.println(x.getItemDescription());
			System.out.println(((Weapon)(x)).getModifierDescription() + "\n");
		}
	}
}