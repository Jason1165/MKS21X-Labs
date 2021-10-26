public class Triangle {

  private Point v1, v2, v3;


  public Triangle(Point V1, Point V2, Point V3) {
    v1 = V1;
    v2 = V2;
    v3 = V3;
  }


  public Triangle(double v1x, double v1y, double v2x, double v2y, double v3x, double v3y) {
    v1 = new Point(v1x, v1y);
    v2 = new Point(v2x, v2y);
    v3 = new Point(v3x, v3y);
  }


  public Point getVertex(int x) {
    if (x == 1) {
      return v1;
    }
    if (x == 2) {
      return v2;
    }
    else //(x == 3) {
      return v3;
    // }
  }


  public void setVertex(int x, Point where) {
    if (x == 1) {
      v1 = where;
    }
    if (x == 2) {
      v2 = where;
    }
    if (x == 3) {
      v3 = where;
    }
  }


  public String toString(){
    return "{" + v1 + ", " + v2 + ", " + v3 + "}";
  }


  public double getPerimeter() {
    double h1 = v1.distanceTo(v2);
    double h2 = v2.distanceTo(v3);
    double h3 = v3.distanceTo(v1);
    return h1+h2+h3;
  }

}
