package Source;
import java.util.*;



public class Conversation {
	public static Scanner sc;
	
	private static String getInput() {
		System.out.print("> ");
		
		return sc.nextLine().trim().toLowerCase();
	}
	
	private static void startConversation() {
		System.out.println("Hello...");
		
		if (!getInput().contains("Hello") || !getInput().contains("Hi") || !getInput().contains("Hey")) {
			System.out.println("You should at least say hello...");
		
			while (!getInput().contains("Hello")) {
				System.out.println("So? :[");
			}
			
			System.out.println("That's better! Now we can talk...");
		}
		
		
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		startConversation();
		
	}

	
}
