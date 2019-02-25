import java.util.Scanner;
import static java.lang.System.*;

public class RunnerBase{
  
	private static Scanner input;
	public static void main(String[] args){
		runGame();
	}
	
	public static void runGame(){	
		boolean Play = printStart();
		
		if(Play)
			postStartText();
	}
	
	public static boolean printStart(){
		input = new Scanner(System.in);
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
		case(1): 
			return true;
		default:
			out.println("\n<< GOODBYE. >>");
			return false;
		}
	}
	
	public static void postStartText(){
		
		newScreen();
		
		input = new Scanner(System.in);
		
		printSlow("Hello! Welcome To Enemy Combat!\n\n",80);
		printSlow("What Is The Name Of Your Champion --> ",80);
		String name = input.nextLine();
		printSlow("\n\n",100); printSlow(name + "! What A Stupid Name!\n\n",80);
		
		printSlow("",80);
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
		catch(InterruptedException e){
			out.println("#### TIMING ERROR ####");
		}
	}
}
