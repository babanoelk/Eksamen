package TaskTwo;

public class PasswordValidator {

    private int minLength;
    private int maxLength;
    private boolean numbersRequired;

    public PasswordValidator(int minLength, int maxLength, boolean numbersRequired) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numbersRequired = numbersRequired;
    }

    public boolean isValid(String password) {
        if ((minLength <= password.length()) && (maxLength >= password.length()) && numbersRequired) {
            boolean hasDigit = false;
            boolean hasUppercase = false;
            boolean hasLowercase = false;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                }

                if (hasDigit && hasUppercase && hasLowercase) {
                    return true;
                }
            }
        } else if ((minLength <= password.length()) && (maxLength >= password.length()) && !numbersRequired) {
            boolean hasUppercase = false;
            boolean hasLowercase = false;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                }

                if (hasUppercase && hasLowercase) {
                    return true;
                }
            }
        }
        return false;
    }
}
