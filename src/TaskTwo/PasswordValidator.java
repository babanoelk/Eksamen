package TaskTwo;

public class PasswordValidator {

    private int minLength;
    private int maxLength;
    private int numbersRequired;

    public PasswordValidator(int minLength, int maxLength, int numbersRequired) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }
}
