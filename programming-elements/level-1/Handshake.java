public class Handshake {
     public static void maxHandshakes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("Maximum number of handshakes possible is " + handshakes);
    }

}
