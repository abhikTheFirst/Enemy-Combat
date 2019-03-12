

public abstract class Brew extends Item {
	/*
	 * Brews have a duration (in turns or attacks) and a potency (in percent) for their effect.
	 * For example, a brew of power would have a duration of d turns and a damage increase of p%.
	 */
	private int duration, potency;
	public Brew(String n, String r, int w, int d, int p) {
		super(n, r, 1, w); // Passes 1 use to Weapon constructor since Brews can only be used once.
		duration = d;
		potency = p;
	}
	public int getDuration() {
		return duration;
	}
	public int getPotency() {
		return potency;
	}
	public void setDuration(int d) {
		duration = d;
	}
	public void setPotency(int p) {
		potency = p;
	}
}