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

	public void printState(State current) {
		String currentState = "\n1. " + current.top + "\n2. " + current.mid + "\n3. " + current.bot;
		System.out.println(currentState);
		Scanner scan = new Scanner(System.in);
		boolean validRow = false;
		while (!validRow) {
			System.out.println("\nSelect a row.");
			String userRow = scan.next();
			if (userRow.matches("\\d+(\\d+)?")) {
				int rowNum = Integer.parseInt(userRow);
				if (rowNum > 3 || rowNum < 1) {
					System.out.println("Invalid entry.");
				} else {
					validRow = true;
					boolean validTake = false;
					while (!validTake) {
						System.out.println("How many do you wish to subtract?");
						String userTake = scan.next();
						if (userTake.matches("\\d+(\\d+)?")) {
							int takeNum = Integer.parseInt(userTake);
							if (rowNum == 1) {
								if (current.top < takeNum) {
									System.out.println("The row doesn't not contain that value.");
								} else {
									validTake = true;
								}
							} else if (rowNum == 2) {
								if (current.mid < takeNum) {
									System.out.println("The row doesn't not contain that value.");
								} else {
									validTake = true;
								}
							} else {
								if (current.bot < takeNum) {
									System.out.println("The row doesn't not contain that value.");
								} else {
									validTake = true;
								}
							}
						} else {
							System.out.println("Please enter a number.");
						}
					}
				}
			} else {
				System.out.println("Please enter a number.");
			}
		}
		//pass row number and number to take away to game
	}
}