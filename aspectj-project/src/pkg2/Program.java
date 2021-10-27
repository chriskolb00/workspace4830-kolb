package pkg2;

public class Program {
   public static void main(String[] args) {
      System.out.println("[DBG] Create a circle object..");
      Circle c1 = new Circle(3.0, 3.0, 2.0);
      System.out.println("[DBG] " + c1.area(Math.PI));
   }
}
