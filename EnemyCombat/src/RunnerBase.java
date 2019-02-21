import java.util.Scanner;
import static java.lang.System.*;
public class RunnerBase{
  
	public static void main(String[] args) throws InterruptedException{
		runGame();
	}
	
	public static void runGame() throws InterruptedException{	
		boolean Play = printStart();
		
		if(Play)
			postStartText();
		
	}
	
	public static boolean printStart() throws InterruptedException{
		Scanner input = new Scanner(System.in);
		
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
			return false;
		}
		
		
	}
	
	public static void postStartText() throws InterruptedException{
		
		out.println("\n\n");
		
		Scanner input = new Scanner(System.in);
		
		printSlow("Hello! Welcome To Enemy Combat!\n\n",100);
		printSlow("What Is The Name Of Your Champion --> ",100);
		String name = input.nextLine();
		printSlow("\n\nOh... ",200); printSlow(name + " Huh.. Doesn't Really Sound Like A Champion",100);
		//Make this sound more interesting
	}
	
	public static void printSlow(String input,int speed) throws InterruptedException{
		
		String[] h = input.split("");
		
		for(String x: h) {
			out.print(x);
			Thread.sleep(speed);
		}
	}
}
