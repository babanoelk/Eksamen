package TaskEight;

public class Lion extends Animal {

    public Lion(boolean isMammal) {
        super(isMammal);
    }

    public void makeSound() {
        System.out.println("Rooooar");
    }

    @Override

    public String toString(){
        return "Lion";
    }

}
