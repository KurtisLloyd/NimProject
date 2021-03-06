/**
 * Created by Kurtis Lloyd on 10/6/2016.
 */
import java.util.Arrays;
import java.util.Scanner;

public class UserInputs {
    static int TOP = 3;
    static int MID = 5;
    static int BOT = 7;
    static int row = 0;
    static final int FIRST_ROW =1;
    static final int SECOND_ROW =2;
    static final int THIRD_ROW = 3;

    public int promptForRow(String name){
        row = promptForInt(name + " it is your turn what row would you like to take from? Pick a number between:", 1, 3);
        return row;
    }

    public int promptForAmount(String name){
        State state = new State(TOP, MID, BOT);
        int maxAmount = 0;
        int amount = 0;
        if (row == FIRST_ROW){
            maxAmount = state.getTop();
            amount = promptForInt(name + " it is your turn how much would you like to take?", 1, maxAmount);
            TOP -= amount;
        }
        else if (row == SECOND_ROW){
            maxAmount = state.getMid();
            amount = promptForInt(name + " it is your turn how much would you like to take?", 1, maxAmount);
            MID -= amount;

        }
        else if(row == THIRD_ROW){
            maxAmount = state.getBot();
            amount = promptForInt(name + " it is your turn how much would you like to take?", 1, maxAmount);
            BOT -= amount;
        }
        else{
            System.out.println("What did you do???? WHYYYYYYY! I Break Now...");
            System.exit(0);
        }

        return amount;
    }
    public int promptForMenuSelection(String options, boolean withQuit) {

        boolean isValidInput = false;

        if (withQuit){
            System.out.println(" If you would like to quit press 0");
        }
        Scanner scan = new Scanner(System.in);
        int optionNum = 0;
        String optionSelected = scan.nextLine();
        optionNum = Integer.parseInt(optionSelected);
        while(!isValidInput){
            if (withQuit){
                System.out.println(optionNum);
                if (optionNum == 0){
                    System.out.println("menuQuit selected");
                    isValidInput = true;
                }
                else if(optionNum >= 1 ){
                    isValidInput = true;
                }
                else {
                    isValidInput = false;
                    System.out.println("invalid input!");
                    optionSelected = scan.nextLine();
                    optionNum = Integer.parseInt(optionSelected);
                }
            }
            else{
                if (optionNum == 0){
                    isValidInput = false;
                    System.out.println("please input a number corresponding with the option");
                    optionSelected = scan.nextLine();
                    optionNum = Integer.parseInt(optionSelected);
                }
                else if (optionNum >= 1){
                    isValidInput = true;
                }
                else {
                    isValidInput = false;
                    System.out.println("invalid input!");
                    optionSelected = scan.nextLine();
                    optionNum = Integer.parseInt(optionSelected);
                }
            }
        }

        return optionNum;
    }
    public  int promptForInt(String prompt, int min, int max) {

        System.out.println(prompt + min + " and " + max);
        Scanner scan = new Scanner(System.in);
        int I = 0;

        boolean correctIn = false;
        while(!correctIn){
            String integ = scan.nextLine();
            I = Integer.parseInt(integ);
            if (I >= min && I <= max){
                correctIn = true;
            }else {
                System.out.println("Incorrect response! Please Try again");
                correctIn = false;

            }
        }
        return I;

    }
    public String promptForInput(String prompt, boolean allowEmpty) {

        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);//assuming there already isn't a scan
        boolean isCorrectInputFromUser = false;
        String In = null;
        while(!isCorrectInputFromUser ){
            In = scan.nextLine();
            if (allowEmpty){
                isCorrectInputFromUser = true;
            }
            else if (!allowEmpty && !In.isEmpty()) {
                isCorrectInputFromUser = true;
            }
            else if (!allowEmpty && In.isEmpty()) {
                isCorrectInputFromUser = false;
            }
        }
        return In;
    }
}