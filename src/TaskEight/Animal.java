package TaskEight;

public abstract class Animal {

    private boolean isMammal = false;

    public Animal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    public void makeSound() {
    }

    public boolean isMammal() {
        return isMammal;
    }
}
