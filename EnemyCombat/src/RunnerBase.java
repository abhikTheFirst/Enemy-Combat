import java.util.Scanner;
import static java.lang.System.*;

public class RunnerBase{
	
	private static Scanner input = new Scanner(System.in);
	
	// MAKE SURE TO IMPLEMENT SCANNER EXCEPTIONS
	private static String[] classNames;
	private static String[] flavorTexts;
	
	public static void main(String[] args){
		runGame();
		input.close();
	}
	
	public static void runGame(){	
		boolean Play = printStart();
		input.nextLine();
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
		
		printSlow("Hello! Welcome To Enemy Combat!\n\n",80);
		printSlow("What Is Your Name --> ",80);
		String playerName = input.nextLine();
		printSlow("\n\n",100); printSlow(playerName + "! What A Stupid Name!\n\n",80);
		printSlow("Now, What Is Your Fighting Style?\n", 80);
		classSelect(classNames, flavorTexts, playerName);
		
	}
	
	public static String classSelect(String[] cNames, String[] fTexts, String pName) { // will return Character
		for(int i = 1; i < classNames.length + 1; i++) {
			out.println("\t" + i + "  " + classNames[i-1]);
			wait(170);
		}
		out.print("CHOOSE --> ");
		int choose = input.nextInt();
		
		newScreen();
		out.println("\n" + classNames[choose] + ": " + flavorTexts[choose]);
		
		out.println("Are You Sure: Y/N");
		out.print("CHOOSE --> ");
		String ans = input.next();
		
		if(ans.equals("Y") || ans.equals("y")) {
			Hero player = new Hero{classNames[choose]};
		}
		else{
			newScreen();
			out.println("Choose Your Fighting Style -->");
			return classSelect(classNames, name);
		}
		
		return player;
	}
	
	public static void printSlow(String input,int speed){
		String[] h = input.split("");
					
		for(String x: h) {
			out.print(x);
			wait(speed);
		}
	}
	
	public static void newScreen() {
		for(int i = 0; i < 10; i++){out.println("\n\n\n\n\n");}
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
