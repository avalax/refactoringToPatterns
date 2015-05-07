package session.fourteen;

public class PoorGuy {
    private int energy = 2;
    private int hungry = 0;
    private boolean burnout = false;

    public String feelings() {
        if (burnout) {
            return "burnout :-(";
        }
        else if (hungry > 0) {
            return "want to eat";
        }
        else if (energy <= 0) {
          return "want to sleep";
        }
        else {
            return "want to code";
        }
    }

    public void codeHard() {
        if (hungry > 0) {
            burnout = true;
        }
        energy--;
    }

    public void sleep() {
        hungry++;
        energy++;
    }

    public void eat() {
        hungry--;
    }
}
