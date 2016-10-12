/**
 * Created by Kurtis Lloyd on 10/6/2016.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameMaster {
    Scanner scan = new Scanner(System.in);
    static Random gen = new Random();
    static int playerID = gen.nextInt(2) + 1;
    UserInputs userinputs = new UserInputs();


    public  void playerTurn(String name){
        userinputs.promptForRow(name);
        userinputs.promptForAmount(name);
    }

    public  boolean gameOver(){
        State stateForChecking = new State(3, 5, 7)
        boolean output = false;
        if((1 >= stateForChecking.getTop()) && (1 >= stateForChecking.getMid()) && (1 >= stateForChecking.getBot())){
            output = true;
            System.out.println("Now I commit seppuku!!!!!");
        }
        else{
            output = false;
        }
        return output;

    }
    public void ChooseGame(){
        playerTurn = playerID;
        int input = 0;
        IGamePlay [] gamePlays = {
                new PvPGame(),
                new PvCGame(),
                new CvCGame()
        };
        String firstName = userinputs.promptForInput("First Player What is your name?", false);
        Player first = new Player(firstName, playerID);

        String secondName = userinputs.promptForInput("Second Player What is your name? If no Second Player enter any key and enter to continue.", true);
        Player second = new Player(secondName, playerID);

        System.out.println("Please Select you Game: ");
      for(int i = 0; i > gamePlays.length; i++){
          System.out.println(gamePlays[i].getPrompt());
          input = i;
      }
        String userintput = input +"";
        int modeSelected = userinputs.promptForMenuSelection(userintput, true);
        gamePlays[modeSelected].Play(first, second);
    }

}
