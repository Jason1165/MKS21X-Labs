public class Driver {
  public static void main(String[] args) {

    double zer = 0.0;
    double notZe = 0.00001;
    double notZ = 0.00000999999;
    double x1 = 100.0;
    double x2 = 200.0;
    double x3 = 99.99999;

    System.out.println("\nTesting the Equality of values");
    System.out.println(closeEnough(x1, x3)); // true
    System.out.println(closeEnough(x2, x3)); // false
    System.out.println(closeEnough(zer, notZe)); // false
    System.out.println(closeEnough(notZe, notZ)); // true


    Point origin = new Point(0, 0);
    Point zero1 = new Point(0, notZe);
    Point zero2 = new Point(0, 100);
    Point zero3 = new Point(0, 99.99999999);
    Point zero4 = new Point(0, 200);

    System.out.println("\nTesting the Equality of Points");
    System.out.println(origin.equals(zero1)); // false
    System.out.println(zero2.equals(zero3)); // true
    System.out.println(zero3.equals(zero4)); // false

    System.out.println("\nTesting null exceptions");
    System.out.println(origin.equals(null)); // false
    Triangle abc2 = new Triangle(0, 0, 0, 3, 4, 0);
    System.out.println(abc2.equals(null)); // false

    Point P1 = new Point(0, 3);
    Point P2 = new Point(4, 0);
    Triangle abc = new Triangle(origin, P1, P2);

    System.out.println("\nTesting a 3/4/5 Triangle");
    System.out.println(abc);
    System.out.println(abc.equals(abc2));
    System.out.println(abc.classify());
    System.out.println(abc.area());
    System.out.println(abc.getPerimeter());

    Triangle equal = new Triangle(0, 0, 3, 0, 1.5, 1.5*(Math.sqrt(3)));
    Triangle cero = new Triangle(origin, origin, origin);
    Triangle equal2 = new Triangle(0, 0, 2, 0, 1, Math.sqrt(3));
    System.out.println("\nTesting an equilateral Triangle");
    System.out.println(equal);
    System.out.println(equal.getVertex(1));
    System.out.println(equal.classify());
    System.out.println(equal.area());

    System.out.println("\n" + cero);
    System.out.println(cero.getVertex(2));
    System.out.println(cero.classify());
    System.out.println(cero.getPerimeter());

    System.out.println("\n" + equal2);
    System.out.println(equal2.getVertex(3));
    System.out.println(equal2.classify());
    System.out.println(equal2.equals(equal)); // false

    System.out.println("\nTesting an isosceles Triangle");
    Triangle iso1 = new Triangle(0, 0, 0, 3, 3, 0);
    Triangle iso2 = new Triangle(0, 0, 100, 0, 0, 100);
    System.out.println(iso1.classify());
    System.out.println(iso1.area());
    System.out.println(iso2.classify());
    System.out.println(iso2.getPerimeter());

    System.out.println("\nTesting scalene triangle");
    Triangle def2 = new Triangle(0, 0, 0.5, 0, 0.5, Math.sqrt(3)/2);
    Triangle what = new Triangle(23, 42, 4823, 4239, 320, 0);
    System.out.println(def2.classify());
    System.out.println(def2.area());
    System.out.println(what.classify());
    System.out.println(what.getPerimeter());


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
