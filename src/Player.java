import java.util.List;

/**
 * Created by Kurtis Lloyd on 9/26/2016.
 */
public class Player {

    private String name;
    private int id;


    public Player(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }

}