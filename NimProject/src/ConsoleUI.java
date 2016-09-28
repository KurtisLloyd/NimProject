package consoleui;

import java.util.*;

public class ConsoleUI {
	int games = 0;
	
	public static void main(String[] args) {
		ConsoleUI cu = new ConsoleUI();
		cu.displayMenu();
	}
	
	//display menu
		//options:
		//player v player
		//player v cpu
		//cpu v cpu
	//ask for selection by number
	//if third option, ask how many games to run
		//create separate method to return that value
	public void displayMenu() {
		String menu = "Gameplay options:\n\t1. Player vs Player\n\t2. Player vs CPU\n\t3. CPU vs CPU";
		System.out.println(menu);
		Scanner scan = new Scanner(System.in);
		int userSelection = scan.nextInt();
		if (userSelection == 1) {
			//call pvp
		} else if (userSelection == 2) {
			//call cvp
		} else if (userSelection == 3) {
			System.out.println("How many games would you like to run?");
			int games = scan.nextInt();
			//call cvc(games)
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
