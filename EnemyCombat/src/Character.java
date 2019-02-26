import java.util.Arrays;

public class Character{
  private String name;
  private int currHealth;
  private int health;
  private int lvl;
  private Item[] items;
  
  public Character(String n, int c, int h, int l, Item[] i){
	  name=n;
	  currHealth=c;
	  health=h;
	  lvl=l;
	  items=i;
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
  public Item[] getItems() {
	  return(items);
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
  public void setItems(Item[] i){
	  items=i;
  }
  public String toString(){
	  return(name+" is level "+lvl+" and has "+currHealth+" of "+health+" health remaining.\nThey inventory is:"Arrays.deepToString(items));
  }
}