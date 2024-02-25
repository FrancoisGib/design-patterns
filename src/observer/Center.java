package observer;

public class Center implements Observer {
   private Boolean observed = false;

   public void update() {
      this.observed = true;
   }

   public void display() {
      System.out.println("Observed : " + this.observed.toString());
   }
}
