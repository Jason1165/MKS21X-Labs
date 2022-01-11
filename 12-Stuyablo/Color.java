public class Color {
  public static void main(String[] args) {
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);
    for (int i = 0; i < 80; i++) {
      System.out.print(Text.colorize(" ", Text.RED + Text.BACKGROUND));
    }
    Text.go(30,1);
    for (int i = 0; i < 80; i++) {
      System.out.print(Text.colorize(" ", Text.RED + Text.BACKGROUND));
    }
    for (int i = 1; i < 31; i++) {
      Text.go(i, 1);
      System.out.print(Text.colorize(" ", Text.RED + Text.BACKGROUND));
      Text.go(i, 80);
      System.out.print(Text.colorize(" ", Text.RED + Text.BACKGROUND));
    }
    Text.showCursor();
    Text.go(31, 1);
  }
}
