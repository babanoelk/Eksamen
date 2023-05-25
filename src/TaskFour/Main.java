package TaskFour;

public class Main {

    public static void main(String[] args) {
        Die die1 = new Die(6);
        Die die2 = new Die(6);

        Cup cup = new Cup(die1, die2);

        System.out.println("There have been total " + cup.howManyIdenticalThrows(30) + " identical throws.");
    }

}
