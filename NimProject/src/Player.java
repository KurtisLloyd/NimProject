import java.util.List;

/**
 * Created by Kurtis Lloyd on 9/26/2016.
 */
public class Player {
    boolean isPlayerTurn;

    public Player(){

    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        isPlayerTurn = playerTurn;
    }

    public void select(State state, List<State> states){
        for (State s : states) {
            if(state == s){
                states.remove(state);
            }
        }
    }
}
