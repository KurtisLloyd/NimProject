import java.util.Random;
import java.util.Scanner;

/**
 * Created by Kurtis Lloyd on 10/6/2016.
 */

public class PvPGame implements IGamePlay {
    Scanner scan = new Scanner(System.in);
    static Random gen = new Random();

    static final int TOP = 3;
    static final int MID = 5;
    static final int BOT = 7;
    static int playerID = gen.nextInt(2) + 1;
    UserInputs userinputs = new UserInputs();


    public  void playerTurn(String name){
        userinputs.promptForRow(name);
        userinputs.promptForAmount(name);
    }

    public  boolean gameOver(){
        boolean output = false;
        if((1 >= TOP) && (1 >= MID) && (1 >= BOT)){
            output = true;
            System.out.println("Now I commit seppuku!!!!!");
        }
        else{
            output = false;
        }
        return output;

    }
    public void playGame(Player one, Player two){
        while(!gameOver()){
            if(playerID == 1){

                playerTurn(one.getName());
                playerID += 1;
            }
            else{

                playerTurn(two.getName());
                playerID -= 1;
            }
        }
    }

    @Override
    public void Play(Player one, Player two) {
        playGame(one,  two);
    }

    @Override
    public String getPrompt() {
        return "Player vs Player";
    }
}
