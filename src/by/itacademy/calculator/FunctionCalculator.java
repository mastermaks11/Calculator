package by.itacademy.calculator;

import by.itacademy.calculator.AddArgument;
import by.itacademy.calculator.Calculator;
import by.itacademy.calculator.DivisionByZeroNumberDoubleException;
import by.itacademy.calculator.SqrtArgument;

import static java.lang.System.out;

/**
 * Created by user on 13.06.2018.
 */
public class FunctionCalculator implements Calculator {
    private AddArgument argument;
    private OperationOfCaltulator operationOfCaltulator;

    public FunctionCalculator(AddArgument argument, OperationOfCaltulator operationOfCaltulator) {
        this.argument = argument;
        this.operationOfCaltulator = operationOfCaltulator;
    }

    @Override
    public void calculator() throws DivisionByZeroNumberDoubleException, NegativeNumberException {
        double argument = this.argument.getArgument();
        double argument2 = 0;
        char operation = operationOfCaltulator.getOpt();
        double sum = 0;
        if (operation == 's') {
            System.out.println(SqrtArgument.sqrtArgument(argument));
        } else {
            argument2 = new AddArgument().getArgument();
            switch (operation) {
                case '+':
                    sum = argument + argument2;
                    break;
                case '-':
                    sum = argument - argument2;
                    break;
                case '*':
                    sum = argument * argument2;
                    break;
                case '/':
                    if (!(Math.abs(argument2 - 0) < 0.000000000000001))
                        sum = argument / argument2;
                    else
                        throw new DivisionByZeroNumberDoubleException("You can not divide by zero");
                    break;
                case '^':
                    sum = Math.pow(argument, argument2);
                    break;

            }
            out.println(sum);
        }
    }
}
