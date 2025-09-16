
class Car{
   int noOfWheels;
   int noOfBreaks;
   String color;
   int noOfSeats;
   int power;
   
   Car(int noOfWheels, int noOfBreaks, String color, int noOfSeats, int power){
        this.noOfBreaks = noOfBreaks;
        this.noOfSeats = noOfSeats;
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.power = power;
   }
   void displayCarInfo() {
        System.out.println("Wheels: " + noOfWheels + ", Brakes: " + noOfBrakes + ", Color: " + color +
                           ", Seats: " + noOfSeats + ", Power: " + power);
    }
}
class BMWCar extends Car{
   int speed;
    BMWCar(int noOfWheels, int noOfBrakes, String color, int noOfSeats, int power, int speed) {
        super(noOfWheels, noOfBrakes, color, noOfSeats, power); // call parent constructor
        this.speed = speed;
        this.power = 40;
    }

    @Override
    void displayCarInfo() {
        super.displayCarInfo();
    }
    System.out.println("power = ", power);

}
public class Inheretance {
    Car car = new Car(4, 0, "black", 5, 40);
    car.displayCarInfo();
    BMWCar myBMWCar = new BMWCar(4, , null, 0, 0, 0)
}
