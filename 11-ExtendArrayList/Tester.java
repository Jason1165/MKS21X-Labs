import java.util.ArrayList;

public class Tester {
  public static boolean DEBUG = false;


  public static void main(String[] args) {
    String TEST;
    NoNullArrayList<String> words;
    NoNullArrayList<Integer> numbers;
    NoNullArrayList<Boolean> bool;

    TEST = "Adding String Object";
    words = new NoNullArrayList<String>();
    try {
      for (int i = 0; i < 500000; i++) {
        int x = (int)(Math.random()*10);
        if (x == 2) {
          words.add(null);
        }
        else {
          words.add("" + x);
        }
      }
    } catch (IllegalArgumentException e) {
      System.out.println(TEST + " PASS");
      if(DEBUG)System.out.println(words.toString());
    }

    TEST = "Adding with index String Object";
    words = new NoNullArrayList<String>();
    try {
      for (int i = 0; i < 500000; i++) {
        int x = (int)(Math.random()*10);
        if (x == 2) {
          words.add(0, null);
        }
        else {
          words.add(0, "" + x);
        }
      }
    } catch (IllegalArgumentException e) {
      System.out.println(TEST + " PASS");
      if(DEBUG)System.out.println(words.toString());
    }

    TEST = "Setting String Object";
    words = new NoNullArrayList<String>(10);
    words.add("first");
    try {
      for (int i = 0; i < 500000; i++) {
        int x = (int)(Math.random()*10);
        int y = (int)(Math.random()*words.size());
        if (x == 2) {
          words.set(0, null);
        }
        else {
          words.set(0, "" + x);
        }
      }
    } catch (IllegalArgumentException e) {
      System.out.println(TEST + " PASS");
      if(DEBUG)System.out.println(words.toString());
    }


  }

}
