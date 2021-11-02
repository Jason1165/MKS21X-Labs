public class Driver {

  public static void main(String[] args) {
    RealNumber x = new RealNumber(1);
    RealNumber y = new RealNumber(2);
    RealNumber z = new RealNumber(3.5);

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
    RationalNumber R2 = new RationalNumber(10, 50);
    RationalNumber R3 = new RationalNumber(11, 50);
    RationalNumber R4 = new RationalNumber(1, 0);
    RationalNumber R5 = new RationalNumber(1000, 0);
    RationalNumber R6 = new RationalNumber(1, 10);
    RationalNumber R7 = new RationalNumber(1, 2);
    RationalNumber R8 = new RationalNumber(2, 5);
    RationalNumber R9 = new RationalNumber(8, 5);

    // System.out.println("\nTesting toString for RationalNumber and reduction");
    // System.out.println(R1);
    // System.out.println(R2);
    // System.out.println(R3);
    // System.out.println(R4);
    // System.out.println(R5); // constructor correct
    // System.out.println("\nTesting reciprocal");
    // System.out.println(R1.reciprocal());
    // System.out.println(R2.reciprocal());
    // System.out.println(R3.reciprocal());
    // System.out.println(R4.reciprocal());
    // System.out.println(R5.reciprocal());
    // System.out.println("\nTesting equality");
    // System.out.println(R1.equals(R2));
    // System.out.println(R1.equals(R3));
    // System.out.println(R4.equals(R5));
    // System.out.println("\nTesting addition");
    // System.out.println(R6.add(R3));
    // System.out.println(R2.add(R3));
    // System.out.println(R4.add(R6));
    // System.out.println(R7.add(R8));
    // System.out.println("\nTesting subtraction");
    // System.out.println(R3.subtract(R6));
    // System.out.println(R2.subtract(R3));
    // System.out.println(R4.subtract(R6));
    // System.out.println(R7.subtract(R8));
    // System.out.println("\nTesting division");
    // // System.out.println(R4.divide(R5));
    // System.out.println(R1.divide(R2));
    // System.out.println(R9.divide(R8));
    // System.out.println(R8.divide(R7));
    // System.out.println("\nTesting multiplication");
    // System.out.println(R1.multiply(R4));
    // System.out.println(R8.multiply(R9));
    // System.out.println(R3.multiply(R7));
    RealNumber N1 = new RealNumber(10);
    RealNumber N2 = new RationalNumber(10, 1);
    RealNumber N3 = new RationalNumber(2, 1);
    RealNumber N4 = new RationalNumber(22, 7);
    System.out.println("\nTesting extensions");
    // System.out.println(N1);
    // System.out.println(N2);
    // System.out.println(N4);
    System.out.println(N4.getValue());
    // System.out.println(N1.equals(N2));
    // System.out.println(N1.equals(N2.getValue()));
    // System.out.println(N1.add(N2));
    // System.out.println(N1.divide(N2));


    // System.out.println(R1);
    // reduce(R1);
    // System.out.println(gcd(210, 45));
    // System.out.println(gcd(97, 20));
    // System.out.println(gcd(-1, 1));
  }

  // public static void reduce(RationalNumber why){
  //   int redu = gcd(why.getNumerator(), why.getDenominator());
  //   int numerator1 = why.getNumerator()/redu;
  //   int denominator1 = why.getDenominator()/redu;
  //   System.out.println(numerator1+"/" +denominator1);
  // }
  //
  // public static int gcd(int a, int b){
  //   int large = Math.abs(a);
  //   int small = Math.abs(b);
  //   if ( small > large) {
  //     large = small;
  //     small = Math.abs(a);
  //   }
  //   int remain = 1;
  //   int result = 1;
  //   while (remain != 0) {
  //     remain = large%small;
  //     result = small;
  //     large = small;
  //     small = remain;
  //   }
  //
  //   /*use euclids method or a better one*/
  //   //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
  //   return result;
  // }
}
