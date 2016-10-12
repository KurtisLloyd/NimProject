/**
 * Created by Kurtis Lloyd on 10/6/2016.
 */
public class CvCGame implements IGamePlay {
    UserInputs UI = new UserInputs();
    @Override
    public void Play(Player one, Player two) {
       UI.promptForInt("How many games would you like to play? ",1, 100000);

    }

    @Override
    public String getPrompt() {
        return "Computer vs Computer";
    }
}
