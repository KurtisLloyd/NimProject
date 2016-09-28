import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kurtis Lloyd on 9/26/2016.
 */
public class Main {

    public static void main(String [] args){
        Game game = new Game();
        List<State> states = game.populateStates();
        for (State s:states
             ) {
            System.out.println(s.toString());
        }

    }
}
