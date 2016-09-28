/**
 * Created by Kurtis Lloyd on 9/26/2016.
 */
public class State {
    int top;
    int mid;
    int bot;
    float average;

    public State(int top, int mid, int bot){
        this.top = top;
        this.mid = mid;
        this.bot = bot;

    }
    public int getTop() {
        return top;
    }

    public int getMid() {
        return mid;
    }

    public int getBot() {
        return bot;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String toString(){
        return top + "\n" + mid + "\n"+ bot + "\n -----";
    }
}
