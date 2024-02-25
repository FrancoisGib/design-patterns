package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {

   public interface Element {
      public void display();
   }

   public class Bottle implements Element {
      private String type = "Bottle";
      private int id;

      public Bottle(int id) {
         this.id = id;
      }

      public String getType() {
         return this.type;
      }

      public int getId() {
         return this.id;
      }

      public void display() {
         System.out.println("Type: " + this.type + ", id: " + this.id);
      }
   }

   public class Pack implements Element {
      private String type = "Pack";
      private List<Bottle> bottles = new ArrayList<>();

      void addBottle(Bottle bottle) {
         this.bottles.add(bottle);
      }

      public String getType() {
         return this.type;
      }

      public List<Bottle> getBottles() {
         return this.bottles;
      }

      public void display() {
         System.out.println(this.type + ':');
         for (Bottle bottle : this.bottles) 
            bottle.display();
      }
   }

   public class Cargo implements Element {
      private List<Element> elements= new ArrayList<>();
      private String type = "Cargo";

      void addElement(Element element) {
         this.elements.add(element);
      }

      public void display() {
         System.out.println(this.type + ':');
         for (Element element : this.elements) 
            element.display();
      }
   }
}