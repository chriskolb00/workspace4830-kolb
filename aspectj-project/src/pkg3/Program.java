package pkg3;

public class Program {
   public static void main(String[] args) {
      System.out.println("[DBG] Create a circle object..");
      Circle c1 = new Circle(3.0, 3.0, 2.0);
      System.out.println("[DBG] Create a square object..");
      Square s1 = new Square(1.0, 2.0, 5);

      System.out.println("[DBG] c1.area() = ");
      System.out.println("[DBG] " + c1.area());
      System.out.println("[DBG] s1.area() = ");
      System.out.println("[DBG] " + s1.area());

      System.out.println("[DBG] s1.distance(c1) = ");
      System.out.println("[DBG] " + s1.distance(c1));
   }
}
