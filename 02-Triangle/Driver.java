public class Driver {
  public static void main(String[] args) {

    Point a = new Point(0, 0);
    Point b = new Point(0, 3);
    Point c = new Point(6, 0);
    Point d = new Point(4, 0);

    Triangle abc = new Triangle(a, b, c);
    Triangle xyz = new Triangle(1, 1, 1, 6, 13, 1);
    Triangle def = new Triangle(0, 0, 0.5, 0, 0.5, Math.sqrt(3)/2);
    Triangle def2 = new Triangle(0, 0, 0.5, 0, 0.5, Math.sqrt(3)/2);
    Triangle jkl = new Triangle(1, 1, Math.sqrt(2)/2 + 1, 1, 1, Math.sqrt(2)/2 + 1);
    Triangle cero = new Triangle(0, 0, 0, 0, 0, 0);

    double aa, bb, cc, dd, ee, ff, gg, hh;
    aa = 0; bb = 0; cc = 0.000001; dd = 100.0; ee = 200.0;
    ff = 99.99999; gg = 0.0000009999; hh = 0.000002;
    // System.out.println("closeEnough");
    // System.out.println(closeEnough(aa, bb)); // true
    // System.out.println(closeEnough(bb, cc)); // false
    // System.out.println(closeEnough(dd, ff)); // true
    // System.out.println(closeEnough(ee, ff)); // false
    // System.out.println(closeEnough(cc, gg)); // true
    // System.out.println(closeEnough(cc, hh)); // false

    Point p3 = new Point(0, 0);
    Point p4 = new Point(0, 100.0);
    Point p5 = new Point(0, 99.99999);
    // System.out.println("points equals");
    // System.out.println(p3.equals(p4));
    // System.out.println(p4.equals(p5));
    // System.out.println(a.equals(p3));

    Triangle off = new Triangle(0, 0, 100, 200, 0, 4);
    Triangle off2 = new Triangle(aa, bb, ff, ee, cc, 4);
    // System.out.println("triangle equals");
    // System.out.println(def2.equals(def));
    // System.out.println(abc.equals(cero));
    // System.out.println(off.equals(off2));

    System.out.println("classify");
    Triangle iso1 = new Triangle(0, 0, 0, 3, 3, 0);
    Triangle equal1 = new Triangle(0, 0, 3, 0, 1.5, 1.5*Math.sqrt(3));
    Triangle what = new Triangle(0, 111, 223, 12, 32, 23);
    System.out.println(iso1.classify());
    System.out.println(equal1.classify());
    System.out.println(what.classify());

    // System.out.println("cero\n" + cero);
    // cero.setVertex(1, new Point(1, 1));
    // cero.setVertex(2, new Point(1, 25));
    // cero.setVertex(3, new Point(8, 1));
    // System.out.println(cero);
    // System.out.println(cero.getPerimeter());
    //
    // System.out.println("\ntoString");
    // System.out.println(abc);
    // abc.setVertex(3, d);
    // System.out.println(abc);
    // System.out.println(xyz);
    // System.out.println(def);
    // System.out.println(jkl);
    //
    // System.out.println("\ngetVertex");
    // System.out.println(abc.getVertex(2));
    // System.out.println(xyz.getVertex(1));
    // System.out.println(def.getVertex(3));
    // System.out.println(jkl.getVertex(2));
    //
    // System.out.println("\ngetPerimeter");
    // System.out.println(abc.getPerimeter());
    // System.out.println(xyz.getPerimeter());
    // System.out.println(def.getPerimeter());
    // System.out.println(jkl.getPerimeter());
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
