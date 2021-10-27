public class Point{

  // fields
  private double x,y;

  // constructors
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  // accessor
  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public String toString() {
    return "("+x+", "+y+")";
  }

  public double distanceTo(Point coor2) {
    double hor = Math.abs(x - coor2.getX());
    double ver = Math.abs(y - coor2.getY());
    return Math.hypot(hor, ver);
  }

  public boolean equals(Point other) {
    if (other == null) {
      return false;
    }
    boolean point1 = closeEnough(x, other.getX());
    boolean point2 = closeEnough(y, other.getY());
    return (point1 && point2);
  }

  // static methods
  public static double distance(Point coor1, Point coor2) {
    double hor = Math.abs(coor1.getX() - coor2.getX());
    double ver = Math.abs(coor1.getY() - coor2.getY());
    return Math.hypot(hor, ver);
  }

  public static boolean closeEnough(double a, double b) {
    double max = b;
    double diff = Math.abs(a-b);
    if (a == 0 && b == 0) {
      return true;
    }
    if (a > b) {
      max = a;
    }
    double percent = (diff/max)*100;
    if (percent <= 0.001) {
      return true;
    }
    return false;
  }

}
