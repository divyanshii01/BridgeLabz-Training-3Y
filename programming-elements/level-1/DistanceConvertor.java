public class DistanceConvertor {
    public static void distanceConverter() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.println(feet + " feet is equal to " + yards + " yards and " + miles + " miles.");
    }
}
