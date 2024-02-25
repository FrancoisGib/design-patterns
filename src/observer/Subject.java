package observer;

public interface Subject {
   public void attach(Observer observer);
   public void detach();
   public void notifyObserver();
}
