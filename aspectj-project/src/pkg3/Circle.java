package pkg3;

public class Circle extends TwoDShape {
   protected double radius;

   public Circle(double x, double y, double r) {
      super(x, y);
      this.radius = r;
   }

   public double area() {
      return Math.PI * radius * radius;
   }

   public String toString() {
      return ("Circle radius = " + String.valueOf(radius) + super.toString());
   }
}
