import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("I will see into your future!\n");

		/* Gather Info */

		System.out.println("Give me your first name, human:");
		String firstName = input.nextLine();

		System.out.println("AND your last name:");
		String lastName = input.nextLine();

		System.out.println("For how many years has this one aged?:");
		int age = input.nextInt();

		System.out.println("In what month was this one born? Put it in a form that pleases me. (TYPE AS NUMBER)");
		int brithMonth = input.nextInt();

		// End Scanning Ints
		input.nextLine();

		System.out.println("What color of the rainbow (ROYGBIV) pleases this one most?");
		System.out.println("Enter HELP if you need me to list them for you.");
		String favColor = "";
		favColor = input.nextLine();

		// ROYGBIV Help Loop

		while (favColor.equalsIgnoreCase("help")) {
			System.out.println("The glorious colors of the rainbow (ROYGBIV) are as follows:");
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

		System.out.println("How many siblings does this one have?:");
		int siblings = input.nextInt();
		input.nextLine();

		/* Outcome Calculations */

		// Years to retirement (age)

		int outcomeRetirement;
		
		if (age % 2 == 0) {
			outcomeRetirement = 36;
		} else {
			outcomeRetirement = 27;
		}
		
		// Vacation Years (Number of siblings)
		
		String outcomeVacation;
		
		switch (siblings) {
		case 0:
			outcomeVacation = "Las Vegas, NV";
			break;
		case 1:
			outcomeVacation = "Myrtle Beach, SC";
			break;
		case 2:
			outcomeVacation = "Paris, France";
			break;
		case 3:
			outcomeVacation = ";
			break;
			
		}

	}
}
