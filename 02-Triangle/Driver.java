public class Driver {
  public static void main(String[] args) {

    Point a = new Point(0, 0);
    Point b = new Point(0, 3);
    Point c = new Point(6, 0);
    Point d = new Point(4, 0);
    Triangle abc = new Triangle(a, b, c);
    Triangle xyz = new Triangle(1, 1, 1, 6, 13, 1);
    Triangle def = new Triangle(0, 0, 0.5, 0, 0.5, Math.sqrt(3)/2);
    Triangle jkl = new Triangle(1, 1, Math.sqrt(2)/2 + 1, 1, 1, Math.sqrt(2)/2 + 1);
    Triangle cero = new Triangle(0, 0, 0, 0, 0, 0);

    System.out.println("cero\n" + cero);
    cero.setVertex(1, new Point(1, 1));
    cero.setVertex(2, new Point(1, 25));
    cero.setVertex(3, new Point(8, 1));
    System.out.println(cero);
    System.out.println(cero.getPerimeter());

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

    System.out.println("closeEnough");
    double aa, bb, cc, dd, ee, ff, gg, hh;
    aa = 0; bb = 0; cc = 0.000001; dd = 100.0; ee = 200.0; ff = 99.99999; gg = 0.0000009999; hh = 0.000002;
    System.out.println(closeEnough(aa, bb)); // true
    System.out.println(closeEnough(bb, cc)); // false
    System.out.println(closeEnough(dd, ff)); // true
    System.out.println(closeEnough(ee, ff)); // false
    System.out.println(closeEnough(cc, gg)); // true
    System.out.println(closeEnough(cc, hh)); // false
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
