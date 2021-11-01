public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (deno == 0) {
      denominator = 1;
      numerator = 0;
    }
    this.reduce();
  }

  public double getValue(){
    return numerator/denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber reci = new RationalNumber(denominator, numerator);
    return reci;
  }

  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    this.reduce();
    other.reduce();
    if (this.numerator == other.getNumerator() && this.denominator == other.getDenominator()) {
      return true;
    }
    return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    if (a == 0) {
      return 1;
    }
    int large = Math.abs(a); // Math.abs for the sake of when a number is negative
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

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int redu = gcd(numerator, denominator);
    numerator = numerator/redu;
    denominator = denominator/redu;
  }

  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int top = this.numerator * other.getNumerator();
    int bottom = this.denominator * other.getDenominator();
    RationalNumber ans = new RationalNumber(top, bottom);
    return ans;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int top = this.numerator / other.getNumerator();
    int bottom = this.denominator / other.getDenominator();
    RationalNumber ans = new RationalNumber(top, bottom);
    return ans;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int top = (this.numerator * other.getDenominator()) + (other.getNumerator() * this.denominator);
    int bottom = this.denominator * other.getDenominator();
    RationalNumber ans = new RationalNumber(top, bottom);
    return ans;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int top = (this.numerator * other.getDenominator()) - (other.getNumerator() * this.denominator);
    int bottom = this.denominator * other.getDenominator();
    RationalNumber ans = new RationalNumber(top, bottom);
    return ans;
  }
}
