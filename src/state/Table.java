package state;

public class Table {
   private State state = new ReadyState();

   public void setState(State state) {
      this.state = state;
   }
 
   public void request() {
      this.state.handle();
   }

   public void next() {
      this.state.next(this);
   }

   private interface State {
      public void handle();
      public void next(Table table);
   }

   private class ReadyState implements State {
      public void handle() {
         System.out.println("Ready State");
      }

      public void next(Table table) {
         table.setState(new OccupiedState());
      }
   }

   private class OccupiedState implements State {
      public void handle() {
         System.out.println("Occupied State");
      }

      public void next(Table table) {
         table.setState(new ReadyState());
      }
   }
}
