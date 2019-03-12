import java.util.Arrays;
public class Character{
	private String name;
	private int currHealth;
	private int health;
	private int lvl;
  
	public Character(String n, int h, int ch, int l){
		name=n;
		health=h;
		currHealth=ch;
	   	lvl=l;
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
	public String toString(){
		return(name+" is level "+lvl+" and has "+currHealth+" of "+health+" health remaining");
	}
}