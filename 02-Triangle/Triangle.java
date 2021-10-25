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

  // main
    public static void main(String[] args) {

      Point a = new Point(0, 0);
      Point b = new Point(0, 3);
      Point c = new Point(6, 0);
      Point d = new Point(4, 0);
      Triangle abc = new Triangle(a, b, c);
      Triangle xyz = new Triangle(1, 1, 1, 6, 13, 1);
      Triangle def = new Triangle(0, 0, 0.5, 0, 0.5, Math.sqrt(3)/2);
      Triangle jkl = new Triangle(1, 1, Math.sqrt(2)/2 + 1, 1, 1, Math.sqrt(2)/2 + 1);

      System.out.println("\ntoString");
      System.out.println(abc);
      abc.setVertex(3, d);
      System.out.println(abc);
      System.out.println(xyz);
      System.out.println(def);
      System.out.println(jkl);

      System.out.println("\ngetVertex");
      System.out.println(abc.getVertex(2));
      System.out.println(xyz.getVertex(1));
      System.out.println(def.getVertex(3));
      System.out.println(jkl.getVertex(2));

      System.out.println("\ngetPerimeter");
      System.out.println(abc.getPerimeter());
      System.out.println(xyz.getPerimeter());
      System.out.println(def.getPerimeter());
      System.out.println(jkl.getPerimeter());
    }

}
