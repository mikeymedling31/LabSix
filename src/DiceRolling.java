//Ignore this was my Extra code stuff
//
//

import java.util.Random;
import java.util.Scanner;

public class DiceRolling {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int die;
		System.out.println("Welcome to the Grand Circus Casino!\n");
		wannaPlay();
		System.out.println("How many sides should each die have?");
		die = input.nextInt();
		System.out.println(results(diceRoll(die),diceRoll2(die)));
	}

//wannaPlay Method		
	private static void wannaPlay() {
		System.out.println("Do you want play?(Y/N)");
		String start = (input.nextLine());
		if (start.equalsIgnoreCase("Y")) {

		} else {
			System.out.println("Then why did you come in?");
			System.out.println("Please leave.");
			System.exit(0);
		}
	}

//diceRoll
	private static int diceRoll(int a) {
		int randomRollA = (int) (Math.random() * (a - 1 + 1) + 1);
		return randomRollA;
	}

//diceRoll2
	private static int diceRoll2(int a) {
		Random rand = new Random();
		int randomRollB = rand.nextInt(a) + 1;
		return randomRollB;
	}

//results Method
	private static String results(int a, int b) {
		if (a + b == 7 || a + b == 11) {
			String result = ("You rolled a Craps! which is when you roll" + "either 7 or 11, you rolled a " + a
					+ " and a " + b + " " + "which equals out to " + (a + b));
			return result;
		} else if (a == 6 && b == 6) {
			String result = ("You rolled a Box car! which is when you roll" + "two 6s!");
			return result;
		} else if (a == 1 && b == 1) {
			String result = ("You rolled Snake eyes! which is when you roll" + " two 1s!");
			return result;
		} else {
			String result = ("You rolled a " + a + " and a " + b + " " + "which equals out to " + (a + b));
			return result;
		}
	}
}
