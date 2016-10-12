import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kurtis Lloyd on 9/26/2016.
 */
public class Game {
public static List<State> ALLSTATES;

    public List<State> populateStates(){
        List<State> states = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            for(int x = 0; x < 6; x++){
                for(int j =0; j < 8; j++) {
                    State state = new State(i, x, j);
                    states.add(state);
                }
            }
        }
        return states;
    }
    public boolean playGame(int games) {
        ALLSTATES = populateStates();
        List<State> states = ALLSTATES;
            int game = games - 1;


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






