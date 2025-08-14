// package BridgeLabz-Training-3Y.programming-elements.level-1;

public class VolumeOfEarth {
     public static void main(String[] args) {
        
        // Radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Conversion factor: 1 km = 0.621371 miles
        double kmToMiles = 0.621371;
        
        // Volume formula: (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Convert radius to miles and calculate volume in miles^3
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
