// package BridgeLabz-Training-3Y.programming-elements.level-1;
import java.util.*;

public class StudentFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter university discount percent: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
