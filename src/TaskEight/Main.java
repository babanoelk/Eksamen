package TaskEight;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Lion lion1 = new Lion(true);
        Parrot parrot1 = new Parrot(false);

        Lion lion2 = new Lion(true);
        Parrot parrot2 = new Parrot(false);

        lion1.makeSound();
        parrot1.makeSound();

        animals.add(lion1);
        animals.add(parrot1);
        animals.add(lion2);
        animals.add(parrot2);


        System.out.println(methodToCheckForIsMammal(animals));
        System.out.println(methodToCheckIfLion(animals));

    }

    public static ArrayList<Animal> methodToCheckForIsMammal(ArrayList<Animal> animals) {
        ArrayList<Animal> checkIsMammal = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.isMammal()) {
                checkIsMammal.add(animal);
            }
        }

        return checkIsMammal;
    }

    public static ArrayList<Animal> methodToCheckIfLion(ArrayList<Animal> animals) {
        ArrayList<Animal> isLion = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.isMammal()) {
                isLion.add(animal);
            }
        }

        return isLion;
    }
}

