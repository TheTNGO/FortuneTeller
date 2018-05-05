import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("I will see into your future!\n");
		
		/* Gather Info */
		
		System.out.println("Give me your first name, human:\n");
		String firstName = input.nextLine();
				
		System.out.println("AND your last name:\n");
		String lastName = input.nextLine();
		
		System.out.println("For how many years has this one aged?:\n");
		int age = input.nextInt();
		
		System.out.println("In what month was this one born? Put it in a form that pleases me. (type as number)");
		int brithMonth = input.nextInt();
		
		System.out.println("What color of the rainbow (ROYGBIV) pleases this one most?");
		System.out.println("Enter HELP if you need me to list them for you.");
		
		
		// ROYGBIV Help Loop
		
		String favColor;
		 
		
		do {	
			favColor = input.nextLine();
			if(favColor.equalsIgnoreCase("help")){
				System.out.println("The ROYGBIV Colors are as follows:");
				System.out.println("Red");
				System.out.println("Orange");
				System.out.println("Yellow");
				System.out.println("Green");
				System.out.println("Blue");
				System.out.println("Indigo");
				System.out.println("Violet");
				System.out.println("What color of the rainbow (ROYGBIV) pleases this one most?");
				System.out.println("Enter HELP if you need me to list them for you.");
				favColor = input.nextLine();
			}
		} while (favColor.equalsIgnoreCase("help"));
		
		
	}

}
