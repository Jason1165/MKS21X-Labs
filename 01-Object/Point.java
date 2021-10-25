public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

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

  public static double distance(Point coor1, Point coor2) {
    double hor = Math.abs(coor1.getX() - coor2.getX());
    double ver = Math.abs(coor1.getY() - coor2.getY());
    return Math.hypot(hor, ver);
  }

}
