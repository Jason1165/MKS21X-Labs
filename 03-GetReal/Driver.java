public class Driver {

  public static void main(String[] args) {
    RealNumber x = new RealNumber(1);
    RealNumber y = new RealNumber(2);
    RealNumber z = new RealNumber(3.5);

    System.out.println("\nTesting 1 and 2");
    System.out.println(x.add(y));
    System.out.println(x.subtract(y));
    System.out.println(x.divide(y));

    System.out.println("\nTesting 'squares'");
    System.out.println(x.multiply(x));
    System.out.println(y.multiply(y));

    System.out.println("\nTesting division");
    System.out.println(z.divide(x));
    System.out.println(z.divide(z));
  }
}
