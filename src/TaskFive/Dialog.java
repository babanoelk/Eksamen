package TaskFive;

import java.util.Scanner;

public class Dialog {

    private int currentYear;
    private Scanner scanner = new Scanner(System.in);

    public Dialog(int currentYear) {
        this.currentYear = currentYear;
    }

    public void getYearOfBirth() {
        System.out.println("Please enter your birth year (XXXX) below: ");
        boolean invalidInput = true;
        int dateYear = 0;

        while (invalidInput) {
            try {
                String input = scanner.nextLine();
                if (input.length() != 4) {
                    throw new IllegalArgumentException("Invalid input! Year must be four numbers (XXXX)!");
                }
                dateYear = Integer.parseInt(input);
                if (dateYear > currentYear) {
                    System.out.println("Your birth year can't be greater than the current year! Try again please.");
                } else if (dateYear < currentYear - 150) {
                    System.out.println("Wrong input! You can't be born before " + (currentYear - 150) + "!");
                } else {
                    invalidInput = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Year must be numbers (XXXX)!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int tillRetirement = getYearsToRetirement(dateYear);
        if (tillRetirement > 0) {
            System.out.println("You now have: " + tillRetirement + " years till retirement.");
        } else if (tillRetirement < 0) {
            System.out.println("You retired: " + (tillRetirement * -1) + " years ago!");
        }
    }

    public int getYearsToRetirement(int i) {
        i += 66;
        i -= currentYear;
        return i;
    }
}
