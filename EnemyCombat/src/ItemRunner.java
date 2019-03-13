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
		System.out.println(i instanceof Shortsword);
		/*
		* This is a cool thing I found out. You can test if a reference to an object is a specific object by using the keyword instanceof.
		* This way there are no runtime errors when, for example, I do a for-each on my inventory and I try to call getModifierDescription() on a Potion or something, because
		* I'll only call getModifierDescription() when x instanceof Weapon is true.
		* For example: new Shortsword instanceof Shortsword = true, instanceof Weapon = true, instanceof Item = true, instanceof Potion = false -- this is how instanceof works
		* I don't know if this is taught in CS3 but I would recommend using it when cycling through the ArrayList of items to make sure that no runtime errors happen
		* by calling invalid methods. (UNLESS there is a way to make my code better to avoid this then let me know)
		*/
	}
}