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
<<<<<<< HEAD
		try {
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
		catch(InterruptedException e) {
			out.println("#### TIMING ERROR ####");
			return false;
=======
		try {	
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
>>>>>>> refs/remotes/origin/Runner
		}
<<<<<<< HEAD
		
=======
		catch(InterruptedException e) {
			out.println("#### TIMING ERROR ####");
			return false;		}
>>>>>>> refs/remotes/origin/Runner
	}
	
	public static void postStartText(){
		
		out.println("\n\n");
		
		Scanner input = new Scanner(System.in);
		
		printSlow("Hello! Welcome To Enemy Combat!\n\n",100);
		printSlow("What Is The Name Of Your Champion --> ",100);
		String name = input.nextLine();
		printSlow("\n\nOh... ",200); printSlow(name + " Huh.. Doesn't Really Sound Like A Champion",100);
		//Make this sound more interesting
	}
	
	public static void printSlow(String input,int speed){
		try {
			String[] h = input.split("");
			
			for(String x: h) {
				out.print(x);
				Thread.sleep(speed);
			}
		}
<<<<<<< HEAD
		catch(InterruptedException e){
=======
		catch(InterruptedException e) {
>>>>>>> refs/remotes/origin/Runner
			out.println("#### TIMING ERROR ####");
		}
	}
}
