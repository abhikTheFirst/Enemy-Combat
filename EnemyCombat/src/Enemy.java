
public class Enemy extends Character {
	private String name;
	private int health;
	private int currHealth;
	private int lvl;
	private int damage;
	private double accuracy;
	private ArrayList<itemBase> loot;
	
	
	public Enemy(String n, int h, int ch, int d, double a, ArrayList<itemBase> l) {
		super(n,h,ch,1);
		damage = d;
		accuracy = a;
		loot = l;
		
	}
	public double getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getDamage() {
		return damage;
	}
	public String getName(){ 
		return(name);  
	}
	public int getCurrHealth(){
		return(currHealth);
	}
	public int getHealth(){
		return(health);
	}
	public int getLvl(){
		return(lvl);
	}
	public void setName(String n){
		name=n;
	}
	public void setCurrHealth(int c){
		currHealth=c;
	}
	public void setHealth(int h){
		health=h;
	}
	public void setLvl(int l){
		lvl=l;
	}
	public ArrayList<itemBase> lootDrop(){
		ArrayList<itemBase> sub = new ArrayList<itemBase>();
		for(int x = 0; x<loot.size();x++) {
			for(int y = 0; y<loot.get(x).getLootNum();y++) {
				if(Math.random()<=loot.get(x).getDropChance()) {
					sub.add(loot.get(x));
				}
			}
		}
		return sub;
	}
	public String toString(){
		return(name+" is level "+lvl+" and has "+currHealth+" of "+health+" health remaining");
	}
}
