package pkg3;

public class Square extends TwoDShape {
   private double s;

   public Square(double x, double y, double s) {
      super(x, y);
      this.s = s;
   }

   public double area() {
      return s * s;
   }

   public String toString() {
      return ("Square side = " + String.valueOf(s) + super.toString());
   }
}
