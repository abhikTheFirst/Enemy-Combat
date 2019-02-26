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
		menu += "+-------------------------------------+\n";
		menu += "| 1. Attack          2. Item          |\n";	
		menu += "|                                     |\n";	
		menu += "| 3. Special Attack  4. Other options |\n";	
		menu += "+-------------------------------------+\n";
		
		return menu;
	}
}
