import alert.*;
import factory_method.BikeDelivery;
import factory_method.CarDelivery;
import factory_method.Delivery;
import observer.Center;
import observer.Station;
import state.Table;

public class Main {
   public static void main(String[] args) {
      Alert alert = new Alert.AmplifiedAlert(new Alert.LightAlert());
      //Alert alert = new Alert.LightAlert();
      //alert = new Alert.AmplifiedAlert(alert);
      System.out.println("Test Decorator Strategy");
      System.out.println(alert.consumedEnergy());
      System.out.println(alert.alert());
      System.out.println("\nTest Factory Method");
      Delivery delivery =  new BikeDelivery();
      delivery.deliver();
      delivery =  new CarDelivery();
      delivery.deliver();
      System.out.println("\nTest State Pattern");
      Table table = new Table();
      table.request();
      table.next();
      table.request();
      System.out.println("\nTest Observer Pattern");
      Center center = new Center();
      Station station = new Station();
      station.attach(center);
      center.display();
      System.out.println("After notification");
      station.notifyObserver();
      center.display();
   }
}
