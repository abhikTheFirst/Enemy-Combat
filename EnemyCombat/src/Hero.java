import java.util.ArrayList;

public class Hero extends Character{
	private String name;
	private int health;
	private int currHealth;
	private int lvl;
	private ArrayList<itemBase> inventory;
	private Weapon activeWeapon;
	//private Armor activeArmor;
	
	public Hero(String n, int h,int ch) {
		super(n,h,ch,1);
		activeWeapon = new Weapon("Stick",1);
		//activeArmor = new Armor("Leather",1);
		inventory = new ArrayList<itemBase>();
		inventory.add(activeWeapon);//inventory.add(activeArmor);
	}
	public ArrayList<itemBase> getInv(){
		return inventory;
	}
	public void updateInv(boolean addOrLose,itemBase sub) {
		if(addOrLose) {
			/*if(inventory.size()>=50)
			{
				System.out.println("Stupid idiot you cannot add anymore items, do you think you could hold this much in real life? Geez man you gotta be sensical every now and again seriously. Honestly I woke up to have just a simple fun day at work and you go along and be all like\"hoho look at me I'm going to hold too many items\" and you just patronize use narrators that are doing the heavy lifting. Come on man, stop being so selfish and think about others for once in your life");
				return;
			}*/
			inventory.add(sub);
		}
		else{
			inventory.remove(indexOf(sub));
		}
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getCurrHealth() {
		return currHealth;
	}
	public void setCurrHealth(int currHealth) {
		this.currHealth = currHealth;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public ArrayList<itemBase> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<itemBase> inventory) {
		this.inventory = inventory;
	}
	public void updateWeapon(int pos) throws IndexOutOfBoundsException {
		if(inventory.get(pos) instanceof Weapon)) {
			activeWeapon = inventory(pos).get();
		}
		else {
			System.out.println("The inventory item is not a weapon and cannot be equipped here");
		}
	}
	//currently has the skeletal versions of updating inventory functions, needs itemBase to be instantiated/extended/implemented or whatever
}