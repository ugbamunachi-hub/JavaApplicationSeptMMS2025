
package classwork2;
public class TestingVehicles {
   public static void main(String[] args){
        
        Vehicles[] vehicleObject = {
        new Bike(),
        new Bus(),
        new Car()
   };
        for(Vehicles vehicle: vehicleObject){
    vehicle.move();    
        
      }}
 
}
