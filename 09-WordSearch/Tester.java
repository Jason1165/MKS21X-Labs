public class Tester {
  public static void main(String[] args) {
    WordSearch test;
    if (args.length == 3) {
      test = new WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]);
      System.out.println(test.toString());
    }
    else if (args.length == 4) {
      test = new WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2], Integer.parseInt(args[3]));
      System.out.println(test.toString());
    }
  }
}
