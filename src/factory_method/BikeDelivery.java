package factory_method;

public class BikeDelivery extends Delivery {
   public Vehicle createVehicle() {
      return new Bike();
   }
}