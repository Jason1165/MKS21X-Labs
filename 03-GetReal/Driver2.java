public class Driver2 {
  public static void main(String[] args) {
    System.out.println("\nTesting Randomness");
    for (int i = 0; i < 5; i++) {
      int value = (int)(Math.random()*(100));
      int value2 = (int)(Math.random()*(100));
      RationalNumber R1 = new RationalNumber(value, value2);
      System.out.println("value: " + value + "\tvalue2: " + value2 + "\tRational: " + R1);
    }
  }
}
