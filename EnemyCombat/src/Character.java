public class abstract Character{
	private String name;
	private int health;
	
	public Character() {
		name = "Gamer";
		health = 1337;
	}
	
	public Character(String n, int h) {
		name = n;
		health = h;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setHealth(int h) {
		health = h;
	}
	public int getHealth() {
		return health;
	}
}
