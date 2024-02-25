package factory_method;

public class CarDelivery extends Delivery {
   public Vehicle createVehicle() {
      return new Car();
   }
}