package Source;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;



public class Conversation {
	public static Scanner sc;
	private static ArrayList<Topic> topics;
	
	private static boolean makeFile;
	
	
	
	private static String getInput() {
		System.out.print("> ");
		
		return sc.nextLine().trim();
	}
	
	private static void getName() {
		System.out.println("What is your name?");
		String name = getInput();
		System.out.println("Hello " + name + ", have we met?");
		if (getInput().contains("yes")) {
			
		} else {
			makeFile = true;
			
		}
	}
	
	/**
	 * Initial Coversation starter
	 */
	private static void startConversation() {
		System.out.println("Hello...");
		String greeting = getInput().toLowerCase();
		
		if (!greeting.contains("hello") && !greeting.contains("hi") && !greeting.contains("hey")) {
			System.out.println("You should at least say hello...");
		
			while (!getInput().contains("Hello")) {
				System.out.println("So? :[");
			}
			
			System.out.println("That's better! Now we can talk...");
		}
		
		getName();
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		topics = new ArrayList<Topic>();
		makeFile = false;
		
		startConversation();
		
	}

	
}
