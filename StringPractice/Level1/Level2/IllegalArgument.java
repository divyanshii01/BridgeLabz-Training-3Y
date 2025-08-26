// package BridgeLabz-Training-3Y.StringPractice.Level1.Level2;
import java.util.*;

public class IllegalArgument {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    String str = sc.nextLine();
    int s = sc.nextInt();
    int end = sc.nextInt();
    try {
        String res = str.substring(s,end);
        System.out.println(res);
    }
     catch (Exception e) {
        System.out.println(e);
    }
  }
}
