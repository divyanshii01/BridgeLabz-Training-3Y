import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring using charAt()
    static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i); // append each character
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Custom substring
        String customSub = customSubstring(text, start, end);

        // Built-in substring
        String builtInSub = text.substring(start, end);

        // Compare results
        boolean result = compareStringsCharAt(customSub, builtInSub);

        // Display
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Comparison Result: " + result);

        sc.close();
    }
}
