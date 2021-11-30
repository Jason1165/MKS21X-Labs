import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Non {
  public static void main(String[] args) {
    if (args[1].equals("1") ) {
      part1(args[0]);
    }
    if (args[1].equals("2") ) {
      part2(args[0]);
    }
  }

  public static void part1(String file) {
    int num = 0;
    try {
      File f = new File(file);
      Scanner in = new Scanner(f);
      while (in.hasNextLine()) {
        String x = in.nextLine();
        boolean contain = naughty(x);
        int amount = countVowels(x);
        boolean dooble = doubleLetters(x);
        if (amount >= 3 && dooble && !contain) {
          num++;
        }
      }
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    System.out.println(num);
  }

  public static boolean doubleLetters(String word) {
    for (int i = 0; i < word.length()-1; i++) {
      if (word.charAt(i) == word.charAt(i+1)) {
        return true;
      }
    }
    return false;
  }

  public static boolean naughty(String word) {
    boolean a = word.contains("ab");
    boolean b = word.contains("cd");
    boolean c = word.contains("pq");
    boolean d = word.contains("xy");
    return (a || b || c || d);
  }

  public static int countVowels(String word) {
    int vowel = 0;
    for (int i = 0; i < word.length(); i++) {
      boolean A = (word.charAt(i) == 'a');
      boolean E = (word.charAt(i) == 'e');
      boolean I = (word.charAt(i) == 'i');
      boolean O = (word.charAt(i) == 'o');
      boolean U = (word.charAt(i) == 'u');
      if (A || E || I || O || U) {
        vowel++;
      }
    }
    return vowel;
  }

  public static boolean containsPair(String word) {
    for (int i = 0; i < word.length()-1 ;i++) {
      String pair = word.substring(i, i+2);
      String left = word.substring(i+2);
      if (left.contains(pair)) {
        return true;
      }
    }
    return false;
  }

  public static boolean repeat(String word) {
    for (int i = 0; i < word.length()-2; i++) {
      if (word.charAt(i) == word.charAt(i+2)) {
        return true;
      }
    }
    return false;
  }

  public static void part2(String file) {
    int num = 0;
    try {
      File f = new File(file);
      Scanner in = new Scanner(f);
      while (in.hasNextLine()) {
        String x = in.nextLine();
        boolean a = repeat(x);
        boolean b = containsPair(x);
        if (b && a) {
          num ++;
        }
      }
    } catch (FileNotFoundException ex){

    }
    System.out.println(num);
  }

}
