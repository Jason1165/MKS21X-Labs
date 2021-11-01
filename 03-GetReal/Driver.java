public class Driver {

  public static void main(String[] args) {
    // RealNumber x = new RealNumber(1);
    // RealNumber y = new RealNumber(2);
    // RealNumber z = new RealNumber(3.5);
    //
    // System.out.println("\nTesting 1 and 2");
    // System.out.println(x.add(y));
    // System.out.println(x.subtract(y));
    // System.out.println(x.divide(y));
    //
    // System.out.println("\nTesting 'squares'");
    // System.out.println(x.multiply(x));
    // System.out.println(y.multiply(y));
    //
    // System.out.println("\nTesting division");
    // System.out.println(z.divide(x));
    // System.out.println(z.divide(z));
    //
    // System.out.println("\nTesting toString");
    // System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);

    RationalNumber R1 = new RationalNumber(100, 500);
    System.out.println(R1);
    reduce(R1);
    // System.out.println(gcd(210, 45));
    // System.out.println(gcd(97, 20));
    // System.out.println(gcd(-1, 1));
  }

  public static void reduce(RationalNumber why){
    int redu = gcd(why.getNumerator(), why.getDenominator());
    int numerator1 = why.getNumerator()/redu;
    int denominator1 = why.getDenominator()/redu;
    System.out.println(numerator1+"/" +denominator1);
  }

  public static int gcd(int a, int b){
    int large = Math.abs(a);
    int small = Math.abs(b);
    if ( small > large) {
      large = small;
      small = Math.abs(a);
    }
    int remain = 1;
    int result = 1;
    while (remain != 0) {
      remain = large%small;
      result = small;
      large = small;
      small = remain;
    }

    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    return result;
  }
}
