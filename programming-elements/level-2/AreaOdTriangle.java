// package BridgeLabz-Training-3Y.programming-elements.level-2;

public class AreaOdTriangle {
     public static void main(String[] args) {
        double baseCm = 10.0;
        double heightCm = 5.0;

        double areaCm = 0.5 * baseCm * heightCm;
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
    }
}
