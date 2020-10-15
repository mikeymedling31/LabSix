import java.util.Random;
import java.util.Scanner;

public class DuoDiceRolling {
	public static void main(String[] args) {

		System.out.println("Welcome to the Grand Circus Casino!");

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			Scanner scnr = new Scanner(System.in);
			System.out.println();
			System.out.println("How many sides should each die have? ");
			int dieSides = scnr.nextInt();

			System.out.println("Roll 1:");
			System.out.println(generateRandomDieRoll(dieSides));
			System.out.println(generateRandomDieRoll2(dieSides));

			System.out.println();
			System.out.println("Roll again? (y/n):");
			cont = scnr.next();

		}

		System.out.println("Thanks for playing");
		
	}

	public static int generateRandomDieRoll(int dieNumber) {
		Random die1 = new Random();
		return die1.nextInt(dieNumber) + 1;
	}

	public static int generateRandomDieRoll2(int dieNumber2) {
		int RandomDieRoll2;
		RandomDieRoll2 = (int) (Math.random() * (dieNumber2 - 1 + 1) + 1);

		return RandomDieRoll2;
	}
}
