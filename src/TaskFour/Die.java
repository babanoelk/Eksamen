package TaskFour;

import java.util.Random;

public class Die {
    Random random = new Random();
    private int die;

    public Die(int die) {
        this.die = die;
    }

    public int roll() {
        return random.nextInt(die) + 1;
    }
}
