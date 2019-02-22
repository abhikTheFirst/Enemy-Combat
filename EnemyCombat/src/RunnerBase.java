package EnemyCombat.src;

import java.util.Scanner;
import static java.lang.System.*;

public class RunnerBase{
  
	public static void main(String[] args){
		runGame();
	}
	
	public static void runGame(){	
		boolean Play = printStart();
		
		if(Play)
			postStartText();
		
	}
	
	public static boolean printStart(){
		try {
			Scanner input = new Scanner(System.in);
			newScreen();
			out.println("▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
			Thread.sleep(170);
			out.println("▲▼▲▼▲▼ ENEMY COMBAT ▼▲▼▲▼▲");
			Thread.sleep(170);
			out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼\n");
			Thread.sleep(170);
			printSlow("  1 >>	START\n", 100);
			printSlow("  2 >>	QUIT\n\n", 100);
			printSlow("  CHOOSE --> ", 100);
			
			switch(input.nextInt()) {
			case(1): 
				return true;
			default:
				out.println("\n<< GOODBYE. >>");
				return false;
			}
		}
		catch(InterruptedException e) {
			out.println("#### TIMING ERROR ####");
			return false;
		}
	}
	
	public static void postStartText(){
		
		newScreen();
		
		Scanner input = new Scanner(System.in);
		
		printSlow("Hello! Welcome To Enemy Combat!\n\n",100);
		printSlow("What Is The Name Of Your Champion --> ",100);
		String name = input.nextLine();
		printSlow("\n\n",100); printSlow(name + "! What A Stupid Name!\n\n",100);
	}
	
	public static void printSlow(String input,int speed){
		try {
			String[] h = input.split("");
			
			for(String x: h) {
				out.print(x);
				Thread.sleep(speed);
			}
		}
		catch(InterruptedException e){
			out.println("#### TIMING ERROR ####");
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
}
