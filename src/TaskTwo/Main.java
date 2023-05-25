package TaskTwo;

public class Main {

    public static void main(String[] args){
        PasswordValidator passwordValidator = new PasswordValidator(2,8,false);

        System.out.println(passwordValidator.isValid("Ahmad1"));
    }
}
