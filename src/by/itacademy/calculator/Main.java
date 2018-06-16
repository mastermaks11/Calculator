package by.itacademy.calculator;

import by.itacademy.calculator.AddArgument;
import by.itacademy.calculator.CalculatorException;
import by.itacademy.calculator.DivisionByZeroNumberDoubleException;
import by.itacademy.calculator.FunctionCalculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by user on 13.06.2018.
 */
public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws CalculatorException, DivisionByZeroNumberDoubleException, Exception {
        try {
            AddArgument argumentsOne = new AddArgument();
            OperationOfCaltulator operationOfCaltulator = new OperationOfCaltulator();
            FunctionCalculator functionCalculator = new FunctionCalculator(argumentsOne, operationOfCaltulator);
            functionCalculator.calculator();
        } catch (CalculatorException | DivisionByZeroNumberDoubleException | NegativeNumberException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }
}
