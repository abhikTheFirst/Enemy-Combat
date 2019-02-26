public class Hero extends Character{
	private String name;
	private int health;
	private ArrayList<itemBase> inventory;
	private Weapon activeWeapon;
	//private Armor activeArmor;
	
	public Hero(String n, int h) {
		super(n,h,h,1);
		activeWeapon = new Weapon("Stick",1);
		activeArmor = new Armor("Leather",1);
		inventory = new ArrayList<itemBase>();
		inventory.add(activeWeapon);//inventory.add(activeArmor);
	}
	public ArrayLisy<itemBase> getInv(){
		return inventory;
	}
	public void updateInv(boolean addOrLose,itemBase sub) {
		if(addOrLose) {
			inventory.add(sub)
		}
		else{
			inventory.remove(indexOf(sub));
		}
	}
	//currently has the skeletal versions of updating inventory functions, needs itemBase to be instantiated/extended/implemented or whatever
}