import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kurtis Lloyd on 9/26/2016.
 */
public class Game {

    public boolean playGame(int games) {
        List<State> states = allStates;
            int game = games - 1;
        Player player1 = new Player();

        for(int i =states.size(); i < 0; i--) {



            if (game != 0 || playGame(game)) {

                return true;
            }
        }
            return false;

        }

    public void selectState(List<State> states){
        for (State s:states) {

        }

    }

}






