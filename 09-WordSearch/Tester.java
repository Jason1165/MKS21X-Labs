public class Tester {
  public static void main(String[] args) {
    WordSearch test = new WordSearch(6, 6);
    // System.out.println(test.toString());
    // System.out.println(test.addWordDiagonal("hello", 0, 0));
    // System.out.println(test.addWordVertical("hello", 0, 0));
    // System.out.println(test.addWordHorizontal("hello", 0, 0));
    // System.out.println(test.addWordHorizontal("elks", 1, 1));
    // System.out.println(test.toString());
    WordSearch model = new WordSearch(5, 5);
    // model.addWordDiagonal("CAT", 0, 0);
    // model.addWordHorizontal("VALUE", 1, 0);
    // model.addWordVertical("END", 1, 4);
    model.addWord(0, 0, "CAT", 1, 1);
    model.addWord(1, 0, "VALUE", 0, 1);
    model.addWord(1, 4, "END", 1, 0);
    model.addWord(0, 0, "impossible", 0, 0);
    model.addWord(0, 0, "CAB", 1, 1);
    System.out.println(model.toString());
  }
}
