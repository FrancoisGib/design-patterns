package singleton;

public class DB {
   private static DB SINGLETON;

   public static DB getInstance() {
      if (SINGLETON == null)
         SINGLETON = new DB();
      return SINGLETON;
   }

   /* ou
    *
    * private static final DB SINGLETON = new DB();
    * 
    * public static DB getInstance() {
    *    return SINGLETON;
    * }
    *
    */

   private DB() {
   }
}