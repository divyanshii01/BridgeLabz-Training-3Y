// package BridgeLabz-Training-3Y.programming-elements.level-1;

public class DiscountOnFee {
    public static void main(String[] args) {
        
        // Variables for fee and discount percentage
        double fee = 125000;
        double discountPercent = 10;
        
        // Calculate discount amount
        double discountAmount = (discountPercent / 100) * fee;
        
        // Calculate final price
        double finalFee = fee - discountAmount;
        
        // Display result
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);

        }
        }
