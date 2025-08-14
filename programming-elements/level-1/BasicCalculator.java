// package BridgeLabz-Training-3Y.programming-elements.level-1;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double sum = number1 + number2;
        double diff = number1 - number2;
        double product = number1 * number2;
        double quotient = number2 != 0 ? number1 / number2 : Double.NaN;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                number1 + " and " + number2 + " is " + sum + ", " + diff + ", " + product + ", and " + quotient);
    }
}
