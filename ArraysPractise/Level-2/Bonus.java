// package BridgeLabz-Training-3Y.ArraysPractise.Level-2;
import java.util.*;

public class Bonus {
    Scanner sc = new Scanner(System.in);
     int n = 10;
        double[][] emp = new double[n][2]; 
        double[] bonus = new double[n], newSal = new double[n];
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));
            do {
                System.out.print("Salary: ");
                while (!sc.hasNextDouble()) { sc.next(); System.out.print("Salary: "); }
                emp[i][0] = sc.nextDouble();
            } while (emp[i][0] <= 0);

            do {
                System.out.print("Years of Service: ");
                while (!sc.hasNextDouble()) { sc.next(); System.out.print("Years of Service: "); }
                emp[i][1] = sc.nextDouble();
            } while (emp[i][1] < 0);
        }

        for (int i = 0; i < n; i++) {
            bonus[i] = emp[i][0] * (emp[i][1] > 5 ? 0.05 : 0.02);
            newSal[i] = emp[i][0] + bonus[i];
            totalOld += emp[i][0]; totalBonus += bonus[i]; totalNew += newSal[i];
            System.out.printf("Emp %d -> Old: %.2f, Bonus: %.2f, New: %.2f%n", i+1, emp[i][0], bonus[i], newSal[i]);
        }

        System.out.printf("%nTotals -> Old: %.2f, Bonus: %.2f, New: %.2f%n", totalOld, totalBonus, totalNew);
}
