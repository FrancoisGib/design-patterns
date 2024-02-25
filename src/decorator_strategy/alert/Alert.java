package alert;

public interface Alert {
   public int consumedEnergy();
   public String alert();

   public class SoundAlert implements Alert {
      public int consumedEnergy() {
         return 2;
      }

      public String alert() {
         return "Sound alert";
      }
   }

   public abstract class AlertDecorator implements Alert {
      protected Alert alert;

      public AlertDecorator(Alert alert) {
         this.alert = alert;
      }

      public abstract int consumedEnergy();

      public abstract String alert();
   }

   public class AmplifiedAlert extends AlertDecorator {
      public AmplifiedAlert(Alert alert) {
         super(alert);
      }

      public int consumedEnergy() {
         return this.alert.consumedEnergy() * 2;
      }

      public String alert() {
         return "Amplified " + this.alert.alert();
      }
   }

   public class BlinkingLightAlert implements Alert {
      public String alert() {
         return "Blinking light alert";
      }

      public int consumedEnergy() {
         return 5;
      }
   }

   public class LightAlert extends BlinkingLightAlert {
      public int consumedEnergy() {
         return super.consumedEnergy() * 3;
      } 

      public String alert() {
         return "Light alert";
      }
   }  
}