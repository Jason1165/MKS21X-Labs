import java.util.*;
public class Game {
  public static final int WIDTH = 80;
  public static final int HEIGHT = 30;
  public static final int TEXTCOLOR = Text.WHITE;
  public static final int TEXTBACKGROUND = Text.BLUE + Text.BACKGROUND;

  public static void main(String[] args) {
    Text.hideCursor();
    Text.clear();
    createBorder(HEIGHT, WIDTH);
    Text.go(HEIGHT+1, 1);
  }

  public static void borderVertical(int len) {
    for (int i = 1 ; i <= len; i++) {
      Text.go(i, 1);
      System.out.print(Text.colorize(" ", TEXTBACKGROUND));
      Text.go(i, WIDTH);
      System.out.print(Text.colorize(" ", TEXTBACKGROUND));
    }
  }

  public static void borderHorizontal(int len) {
    for (int i = 1 ; i <= len; i++) {
      Text.go(1, i);
      System.out.print(Text.colorize(" ", TEXTBACKGROUND));
      Text.go(HEIGHT, i);
      System.out.print(Text.colorize(" ", TEXTBACKGROUND));
    }
  }

  public static void createBorder(int x, int y) {
    borderVertical(x);
    borderHorizontal(y);
  }
}
