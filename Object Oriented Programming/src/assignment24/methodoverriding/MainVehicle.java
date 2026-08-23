package assignment24.methodoverriding;

public class MainVehicle {

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        
        airplane.move();
        bicycle.move();
        car.move();
    }
}
