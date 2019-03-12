import java.util.ArrayList;
import java.util.Arrays;
public class Modifier {
	/* 
	 * A modifier is an element of randomness added to a weapon that gives it a prefix beforehand and an
	 * appropriate increase or decrease in damage. The Weapon constructor gives it a random Modifier which
	 * is there permanently unless it is re-forged (this doesn't have to be used, just a method in the Weapon
	 * class. Modifiers can be scrapped if the element of randomness is unwanted. There are eight positive
	 * and four negative modifiers.
	 */
	private String modifierName;
	private int modifierEffect;
	private ArrayList<String> POSSIBLE_MODIFIER_NAMES = new ArrayList<String>(Arrays.asList(new String[] {"Sturdy", "Robust", "Strong", "Forceful", "Dominant", "Superior", "Powerful", "Ruthless", "Dull", "Blunt", "Rough", "Broken"}));
	private ArrayList<Integer> POSSIBLE_MODIFIER_EFFECTS = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 5, 8, 10, 12, 15, 16, 18, -2, -5, -8, -10}));	
	public Modifier() {
		/* 
		* A weapon is given a random positive or negative modifier. The modifier's name index always
		* correlates with its effect's index; for example, a weapon assigned to be Strong will do +8% damage.
		*/
		int index = (int)(Math.random() * POSSIBLE_MODIFIER_NAMES.size());
		modifierName = POSSIBLE_MODIFIER_NAMES.get(index);
		modifierEffect = POSSIBLE_MODIFIER_EFFECTS.get(index);
	}
	public Modifier(String n, int e) {
		/*
		 * This constructor only to be used when explicit modifiers want to be gained externally
		 * using Weapon.setModifier. Modifiers are supposed to be random so this should not be
		 * used in the actual game, just for testing.
		 */
		modifierName = n;
		modifierEffect = e;
	}
	public void setModifierName(String n) {
		modifierName = n;
	}
	public void setModifierEffect(int e) {
		modifierEffect = e;
	}
	public String getModifierName() {
		return modifierName;
	}
	public int getModifierEffect() {
		return modifierEffect;
	}
	public String toString() {
		return modifierName;
	}
}