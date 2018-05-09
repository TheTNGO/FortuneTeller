import java.text.DecimalFormat;
import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		/* Initialization */

		Scanner input = new Scanner(System.in);
		System.out.println("I will see into your future!\n");

		/* Gather Info */

		System.out.println("Give me your first name, human:");
		String firstName = input.nextLine();

		System.out.println("\nAND your last name:");
		String lastName = input.nextLine();

		System.out.println("\nFor how many years has this one aged?:");
		int age = input.nextInt();

		System.out.println("\nIn what month was this one born? Put it in a form that pleases me. (TYPE AS NUMBER)");
		int birthMonth = input.nextInt();
		input.nextLine();

		System.out.println("\nWhat color of the rainbow (ROYGBIV) pleases this one most?");
		System.out.println("Enter HELP if you need me to list them for you.");
		String favColor = "";
		favColor = input.nextLine();

		// ROYGBIV Help Loop

		while (favColor.equalsIgnoreCase("help")) {
			System.out.println("\nThe glorious colors of the rainbow (ROYGBIV) are as follows:");
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

		System.out.println("\nHow many siblings does this one have?:");
		int siblings = input.nextInt();
		input.nextLine();

		// Input Cleanup

		input.close();

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

		if (siblings == 0) {
			outcomeVacation = "in Las Vegas, NV";
		} else if (siblings == 1) {
			outcomeVacation = "in Myrtle Beach, SC";
		} else if (siblings == 2) {
			outcomeVacation = "in Paris, France";
		} else if (siblings == 3) {
			outcomeVacation = "in San Francisco, CA";
		} else if (siblings >= 4) {
			outcomeVacation = "in Cancun, Mexico";
		} else {
			outcomeVacation = "inside a wardrobe with a lion and a witch";
		}

		// Mode of Transportation (Favorite color)

		String outcomeTransportation = favColor.toLowerCase();

		switch (outcomeTransportation) {
		case "red":
			outcomeTransportation = "new Bugattis";
			break;
		case "orange":
			outcomeTransportation = "DeLorean Time Machine";
			break;
		case "yellow":
			outcomeTransportation = "personal limo";
			break;
		case "green":
			outcomeTransportation = "bus";
			break;
		case "blue":
			outcomeTransportation = "donkey";
			break;
		case "indigo":
			outcomeTransportation = "Segway";
			break;
		case "violet":
			outcomeTransportation = "private jet";
		default:
			outcomeTransportation = "motorized office chair";
		}

		// Bank Balance (Birth month)

		double outcomeBankBalance;

		if (birthMonth >= 9 && birthMonth <= 12) {
			outcomeBankBalance = 9000.01;
		} else if (birthMonth >= 5 && birthMonth <= 8) {
			outcomeBankBalance = 190064925.62;
		} else if (birthMonth <= 4 && birthMonth >= 1) {
			outcomeBankBalance = 86753.09;
		} else {
			outcomeBankBalance = 0.00;
		}

		// *Converting 190064925.62 from Scientific Notation to Real Number
		String outcomeBankBalanceAsString = "";
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		outcomeBankBalanceAsString = decimalFormat.format(outcomeBankBalance);

		/* Fortune Reading */

		System.out.println("\n" + firstName + " " + lastName + " will retire in " + outcomeRetirement + " years with "
				+ outcomeBankBalanceAsString + " in the bank, \na vacation home " + outcomeVacation + ", and travel by "
				+ outcomeTransportation + ".");

		System.out.println("\nFortuneTellerApp.java HAS SPOKEN!");

	}
}
