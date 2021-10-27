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
    System.out.println(origin.equals(null)); // false


    Point P1 = new Point(0, 3);
    Point P2 = new Point(4, 0);
    Triangle abc = new Triangle(origin, P1, P2);
    Triangle abc2 = new Triangle(0, 0, 0, 3, 4, 0);
    System.out.println("\nTesting a 3/4/5 Triangle");
    System.out.println(abc);
    System.out.println(abc.equals(abc2));
    System.out.println(abc.classify());
    System.out.println(abc.area());
    System.out.println(abc.getPerimeter());


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
