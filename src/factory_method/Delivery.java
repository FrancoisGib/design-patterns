package factory_method;

public abstract class Delivery {
   protected Client client = new Client();

   public abstract Vehicle createVehicle();

   public boolean deliver() {
      Vehicle vehicle = this.createVehicle();
      this.client.deliver(vehicle);
      return true;
   }

   public class Client {
      public void deliver(Vehicle vehicle) {
         System.out.println(vehicle.getDescription());
      }
   }
}
