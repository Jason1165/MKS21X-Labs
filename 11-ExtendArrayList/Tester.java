import java.util.*;
public class Tester {
  public static void main(String[] args) {
    ArrayList<String> test = new ArrayList<String>();
    test.add(null);
    System.out.println(test.toString());
    try {
      NoNullArrayList<String> name = new NoNullArrayList<String>();
      name.add("hello");
      name.add(null);
      System.out.println(name.toString());
      System.out.println("Test 1 Passed");
    } catch (IllegalArgumentException e) {
      System.out.println("passed");
    }
  }
}
