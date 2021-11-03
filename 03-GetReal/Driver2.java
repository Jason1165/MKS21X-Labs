public class Driver2 {

  public static void main(String[] args) {
    System.out.println("\nTesting Randomness");
    for (int i = 0; i < 5; i++) {
      int a = 0;
      int b = 4;
      int value = (int)(Math.random()*(b-a+1)+a);
      int value2 = (int)(Math.random()*(b-a+1)+a);
      RationalNumber R1 = new RationalNumber(value, value2);
      RationalNumber R2 = new RationalNumber(value2, value);
      RealNumber vx = new RealNumber(value);
      RealNumber v2 = new RealNumber(value2);
      System.out.println("v1: " + value + "\t\tv2: " + value2);
      System.out.println("R1: " + R1 + "\t\tR2: " + R2);
      System.out.println("compareTo 1v2: " + R1.compareTo(R2));
      System.out.println("compareTo v1 v2: " + vx.compareTo(v2));
      System.out.println("compare to v1 R1: " + vx.compareTo(R1));
      System.out.println();
    }
  }

}
