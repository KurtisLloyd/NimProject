package consoleui;

import java.util.*;

public class ConsoleUI {
	int games = 0;

	public static void main(String[] args) {
		ConsoleUI cu = new ConsoleUI();
		cu.displayMenu();
	}

	public void displayMenu() {
		boolean validSelection = false;
		while (!validSelection) {
			String menu = "Gameplay options:\n\t1. Player vs Player\n\t2. Player vs CPU\n\t3. CPU vs CPU";
			System.out.println(menu);
			Scanner scan = new Scanner(System.in);
			String userEntry = scan.next();
			if (userEntry.matches("\\d+(\\d+)?")) {
				int userSelection = Integer.parseInt(userEntry);
				if (userSelection == 1) {
					validSelection = true;
					//call pvp
				} else if (userSelection == 2) {
					validSelection = true;
					//call cvp
				} else if (userSelection == 3) {
					validSelection = true;
					boolean validNum = false;
					while (!validNum) {
						System.out.println("How many games would you like to run?");
						String nextEntry = scan.next();
						if (nextEntry.matches("\\d+(\\d+)?")) {
							validNum = true;
							int games = Integer.parseInt(nextEntry);
							//call cvc(games)
						} else {
							System.out.println("Please enter a number.");
						}
					}
				} else {
					System.out.println("Invalid entry.");
				}
			} else {
				System.out.println("Invalid entry.");
			}
		}
	}

	public int returnGames() {
		return games;
	}

	//display state of current board
	//print values ascending left to right
	//print a 0 if the row is empty
	//ask which row they want
	//ask how many to take away
	public void printState() {

	}

}
