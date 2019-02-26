import java.util.Scanner;
import static java.lang.System.*;

public class RunnerBase{
	
	private static Scanner input = new Scanner(System.in);
	
	// MAKE SURE TO IMPLEMENT SCANNER EXCEPTIONS
	
	public static void main(String[] args){
		runGame();
		input.close();
	}
	
	public static void runGame(){	
		boolean Play = printStart();
		
		if(Play)
			postStartText();
	}
	
	public static boolean printStart(){
		newScreen();
		out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
		wait(170);
		out.println("▲▼▲▼▲▼ ENEMY COMBAT ▼▲▼▲▼▲");
		wait(170);
		out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼\n");
		wait(170);
		printSlow("  1 >>	START\n", 80);
		printSlow("  2 >>	QUIT\n\n", 80);
		printSlow("  CHOOSE --> ", 80);
		
		switch(input.nextInt()) {
		case 1: 
			return true;
		case 2:
			out.println("\n<< GOODBYE. >>");
			return false;
		default:
			return printStart();
		}
	}
	
	public static void postStartText(){
		newScreen();
		String[] classNames = {"Warrior", "Archer", "Mage"};
		
		printSlow("Hello! Welcome To Enemy Combat!\n\n",80);
		printSlow("What Is Your Name --> ",80);
		String name = input.nextLine();
		printSlow("\n\n",100); printSlow(name + "! What A Stupid Name!\n\n",80);
		printSlow("Now, What Is Your Fighting Style?\n", 80);
		
	}
	public static String classSelect(String[] classNames, String name) { // will return Character
		for(int i = 1; i < classNames.length + 1; i++) {
			out.println("\t" + i + "  " + classNames[i-1]);
			wait(170);
		}
		out.print("CHOOSE --> ");
		int choose = input.nextInt();
		Character player;
		
		switch(choose) {
		case 1:
			//player = new Character(name,classNames[choose - 1]);
			break;
		case 2:
			//player = new Character(name,classNames[choose - 1]);
			break;
		case 3:
			//player = new Character(name,classNames[choose - 1]);
			break;
		default:
			newScreen();
			return classSelect(classNames, name);
		}
		
		//return player;
		return ""; // fake!
	}
	
	public static void printSlow(String input,int speed){
		String[] h = input.split("");
					
		for(String x: h) {
			out.print(x);
			wait(speed);
		}
	}
	
	public static void newScreen() {
		out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public static void wait(int time) {
		try {
			Thread.sleep(time);
		}
		catch(InterruptedException e) {
			out.println("#### TIMING ERROR ####");
		}
	}
}
