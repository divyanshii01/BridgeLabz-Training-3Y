// package BridgeLabz-Training-3Y.programming-elements.level-1;

public class PenDivision {
    public static void main(String[] args) {
        
        // Variables for total pens and students
        int totalPens = 14;
        int students = 3;
        
        // Calculate pens per student
        int pensPerStudent = totalPens / students;
        
        // Calculate remaining pens
        int remainingPens = totalPens % students;
        
        // Display result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
    }
