package pkg3;

public abstract class TwoDShape {
   protected double x, y;

   protected TwoDShape(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }

   public double distance(TwoDShape s) {
      double dx = Math.abs(s.getX() - x);
      double dy = Math.abs(s.getY() - y);
      return Math.sqrt(dx * dx + dy * dy);
   }

   public abstract double area();
}
