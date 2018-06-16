package by.itacademy.calculator;

/**
 * Created by user on 13.06.2018.
 */
public class SqrtArgument {
    public static double sqrtArgument(double argument) throws NegativeNumberException {
        if (argument - 0 > 0.00000000001)
            return Math.sqrt(argument);
        else {
            throw new NegativeNumberException("You can not use negative numbers for this operation");
        }
    }
}
