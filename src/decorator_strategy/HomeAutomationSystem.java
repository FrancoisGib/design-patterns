import alert.Alert;

public class HomeAutomationSystem {
   private float battery = 100;
   private Alert alert;

   public HomeAutomationSystem(Alert alert) {
      this.alert = alert;
   }

   public void decreaseBatteryAfterAlter() {
      this.battery -= this.battery * this.alert.consumedEnergy() / 100;
   }
}