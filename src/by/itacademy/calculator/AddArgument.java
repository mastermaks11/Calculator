package by.itacademy.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by user on 13.06.2018.
 */
public class AddArgument {
    private double argument;
    private final static Logger LOGGER = Logger.getLogger(AddArgument.class.getName());

    public AddArgument() throws InputMismatchException, NumberFormatException {
        boolean enterNumber = true;
        while (enterNumber)
            try {
                System.out.println("Введите значение аргумента");
                this.argument = new Scanner(System.in).nextDouble();
                enterNumber = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не правильно, это не число");
                LOGGER.log(Level.SEVERE, "Введено неправльное значение");
            }
    }

    public double getArgument() {
        return argument;
    }
}
