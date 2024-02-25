package observer;

public class Station implements Subject {
   private Observer observer;

   public void notifyObserver() {
      if (this.observer != null)
         this.observer.update();
   }

   public void attach(Observer observer) {
      this.observer = observer;
   }

   public void detach() {
      this.observer = null;
   }
}
