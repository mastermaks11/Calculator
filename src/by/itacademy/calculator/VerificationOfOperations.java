package by.itacademy.calculator;

/**
 * Created by user on 14.06.2018.
 */
public class VerificationOfOperations {
    private String operationString;
    private char[] operationArrayChar;
    private boolean verification = false;

    public VerificationOfOperations(String operationString, char[] operationArrayChar) {
        this.operationString = operationString;
        this.operationArrayChar = operationArrayChar;
    }

    public boolean verification() {
        char charVerification = operationString.charAt(0);
        for (int i = 0; i < operationArrayChar.length; i++) {
            if (operationArrayChar[i] == charVerification)
                verification = true;
        }
        return verification;
    }

}
