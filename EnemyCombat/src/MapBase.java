package EnemyCombat.src;

import java.util.Scanner;

public class MapBase{
	public static void main(String[] args){
		//maps stuff
		//double stuffed oreos
		System.out.println(MapBase.topMostMenu());
	}
	
	public static String topMostMenu() {
		String menu = "";
		
		String[] options = {"Attack", "Items", "Switch", "Run"};
		
		for(int i = 0; i < options.length; i += 2) {
			menu += String.format("%-10s	", i+1 + ". " + options[i]);
			menu += String.format("%-10s\n", i+2 + ". " + options[i+1]);
		}
		menu = "\n" + menu; 
		for(int i = 0; i < 14; i++) {
			menu = "--" + menu;
			menu += "--";
		}	
		
		return menu;
	}
	/*
	public static String listItems(ArrayList<item> list) {
		String menu = "";
		
		for(int i = 0; i < list.size(); i++) {
			menu += String.format("%-20s	\n", i+1 + ". " + list.get(i).getName());
		}
		return menu;
	}
	*/
	
	
}
