public class Triangle {

  // fields
  private Point v1, v2, v3;

  // constructors
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

  // accessor
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

  public String toString(){
    return "{" + v1 + ", " + v2 + ", " + v3 + "}";
  }

  public double getPerimeter() {
    double h1 = v1.distanceTo(v2);
    double h2 = v2.distanceTo(v3);
    double h3 = v3.distanceTo(v1);
    return h1+h2+h3;
  }

  public boolean equals(Triangle other) {
    boolean vert1 = v1.equals(other.getVertex(1));
    boolean vert2 = v2.equals(other.getVertex(2));
    boolean vert3 = v3.equals(other.getVertex(3));
    // System.out.println(v1 + "  " + v2 + "   " + v3);
    // System.out.println(vert1 + "" + vert2 + "" + vert3);
    // System.out.println(other.getVertex(1) + "   " + other.getVertex(2) + "   " + other.getVertex(3));
    return (vert1 && vert2 && vert3);
  }

  public String classify() {
    double h1 = v1.distanceTo(v2);
    double h2 = v2.distanceTo(v3);
    double h3 = v3.distanceTo(v1);
    System.out.println(h1 + "  " + h2 + "  " + h3);
    boolean len1 = closeEnough(h1, h2);
    boolean len2 = closeEnough(h2, h3);
    boolean len3 = closeEnough(h3, h1);
    if (len1 && len2 && len3) {
      return "equilateral";
    }
    if (len1 || len2 || len3) {
      return "isosceles";
    }
    // System.out.println(len1 + "  " + len2 + "  " + len3);
    return "scalene";
  }

  public double area() {
    double s = getPerimeter() * 0.5;
    double a = v1.distanceTo(v2);
    double b = v2.distanceTo(v3);
    double c = v3.distanceTo(v1);
    // System.out.println(s + "  " + a + "  " + b + "  " + c);
    double are = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return are;
  }

  // mutator
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


  // static methods
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
