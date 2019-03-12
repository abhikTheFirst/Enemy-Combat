
public interface Modifiable {
	public static final String[] POSSIBLE_MODIFIER_NAMES = new String[] {"Sturdy", "Robust", "Strong", "Forceful", "Dominant", "Superior", "Powerful", "Ruthless", "Dull", "Blunt", "Rough", "Broken"};
	public static final int[] POSSIBLE_MODIFIER_EFFECTS = new int[] {2, 5, 8, 10, 12, 15, 16, 18, -2, -5, -8, -10};
	public abstract String getModifierDescription();
	public abstract void reforge();
}