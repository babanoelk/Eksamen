package TaskFour;

public class Cup {

    private Die die1;
    private Die die2;

    public Cup(Die die1, Die die2) {
        this.die1 = die1;
        this.die2 = die2;
    }

    public int howManyIdenticalThrows(int times) {
        int counter = 0;
        for (int i = 0; times > i; i++) {
            int throw1 = die1.roll();
            int throw2 = die2.roll();
            if (throw1 == throw2) {
                System.out.println("Throw " + i + " is identical: " + throw1 + " ; " + throw2);
                counter++;
            }
        }
        return counter;
    }
}
