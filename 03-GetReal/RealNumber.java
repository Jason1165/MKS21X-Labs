public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *returns a negative value when other is larger,
  *positive when other is smaller,
  *or 0 when they are equal
  */
  public int compareTo(RealNumber other) {
    if (this.getValue() == other.getValue()) {
      return 0;
    }
    if (this.getValue() > other.getValue()) {
      return 1;
    }
    if (this.getValue() < other.getValue()) {
      return -1;
    }
    else {
      return 1010101; // should never happen
    }
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){

     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)

     return value + other.getValue();
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return value * other.getValue();
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return value / other.getValue();
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return value - other.getValue();
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }
}
