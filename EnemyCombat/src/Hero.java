public class Hero extends Character{
	private String name;
	private int health;
	private ArrayList<itemBase> inventory;
	private Weapon activeWeapon;
	//private Armor activeArmor;
	
	public Hero(String n, int h) {
		super(n,h,h,1);
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
			inventory.add(sub);
		}
		else{
			inventory.remove(indexOf(sub));
		}
	}
	
	public void updateWeapon(int pos) {
		if(inventory.get(pos) instanceof Weapon)) {
			activeWeapon = inventory(pos).get();
		}
		else {
			System.out.println("The inventory item is not a weapon and cannot be equipped here");
		}
	}
	//currently has the skeletal versions of updating inventory functions, needs itemBase to be instantiated/extended/implemented or whatever
}