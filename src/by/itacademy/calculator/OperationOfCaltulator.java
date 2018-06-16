package by.itacademy.calculator;

import by.itacademy.calculator.CalculatorException;

import java.util.Scanner;

/**
 * Created by user on 13.06.2018.
 */
public class OperationOfCaltulator {
    private char[] opetain = {'*', '+', '-', '/', '^', 's'};
    private char opt;

    public OperationOfCaltulator() throws NumberFormatException, CalculatorException {
        System.out.println("Введите операцию которую хотите произвести над аргументом");
        System.out.println("+ (сложение) . - (вычитание) . * (умножение). / (деление) . ^ (возведение в степень). s(корень из числа)");
        String operationString = new Scanner(System.in).next();
        VerificationOfOperations verificationOfOperations = new VerificationOfOperations(operationString, getOpetain());
        if (verificationOfOperations.verification() && operationString.length() == 1)
            this.opt = operationString.charAt(0);
        else
            throw new CalculatorException("Such an operation does not exist");
    }

    public char[] getOpetain() {
        return opetain;
    }

    public char getOpt() {
        return opt;
    }
}
