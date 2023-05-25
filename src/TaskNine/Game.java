package TaskNine;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private String name;
    Scanner scanner = new Scanner(System.in);

    public Game() {
        createGame();
        startGame();
    }

    public void createGame() {
        System.out.println("Welcome to STEN, SAKS & PAPIR game! What is your name? (Please write it below) :");
        name = scanner.nextLine();
    }

    public void startGame() {
        System.out.println("Which move do you want to choose, " + name + "? (sten, saks or papir?)");

        boolean continueGame = true;

        while (continueGame) {
            String computerMove = computerEnemy();
            String personMove = scanner.nextLine();

            //Same move
            if (personMove.equalsIgnoreCase("sten") && computerMove.equalsIgnoreCase("sten")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("Tie!");
                continueGame = continueGame();

            } else if (personMove.equalsIgnoreCase("saks") && computerMove.equalsIgnoreCase("saks")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("Tie!");
                continueGame = continueGame();

            } else if (personMove.equalsIgnoreCase("papir") && computerMove.equalsIgnoreCase("papir")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("Tie!");
                continueGame = continueGame();

                //Saks move
            } else if (personMove.equalsIgnoreCase("saks") && computerMove.equalsIgnoreCase("papir")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("You won! Pc lost!");
                continueGame = continueGame();

            } else if (personMove.equalsIgnoreCase("saks") && computerMove.equalsIgnoreCase("sten")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("You lost! Pc won!");
                continueGame = continueGame();

                //Sten move
            } else if (personMove.equalsIgnoreCase("sten") && computerMove.equalsIgnoreCase("papir")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("You lost! Pc won!");
                continueGame = continueGame();

            } else if (personMove.equalsIgnoreCase("sten") && computerMove.equalsIgnoreCase("saks")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("You won! Pc lost!");
                continueGame = continueGame();

                //papir move
            } else if (personMove.equalsIgnoreCase("papir") && computerMove.equalsIgnoreCase("saks")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("You lost! Pc won!");
                continueGame = continueGame();

            } else if (personMove.equalsIgnoreCase("papir") && computerMove.equalsIgnoreCase("sten")) {
                System.out.println("You chose: " + personMove);
                System.out.println("Pc chose: " + computerMove);
                System.out.println("You won! Pc lost!");
                continueGame = continueGame();

            } else {
                System.out.println("I didn't understand your move. Please try again.");
            }
        }

    }

    private String computerEnemy() {
        Random random = new Random();

        int computerWeapon = random.nextInt(3) + 1;

        if (computerWeapon == 1) {
            return "sten";
        } else if (computerWeapon == 2) {
            return "saks";
        } else {
            return "papir";
        }
    }

    private boolean continueGame() {
        System.out.println("New game? Y/N");
        boolean getInput = true;
        boolean returnValue = true;

        while (getInput)
            try {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Y")) {
                    returnValue = true;
                    System.out.println("Which move do you want to choose now?");
                    getInput = false;
                } else if (input.equalsIgnoreCase("N")) {
                    returnValue = false;
                    getInput = false;

                }
            } catch (Exception e) {
                System.out.println("I didn't understand that. What did you mean?");
            }
        return returnValue;
    }

}
