import java.util.*;
public class Game {
  public static final int WIDTH = 80;
  public static final int HEIGHT = 30;
  public static final int TEXTCOLOR = Text.WHITE;
  public static final int TEXTBACKGROUND = Text.BLUE + Text.BACKGROUND;

  public static void main(String[] args) {
    Text.hideCursor();
    Text.clear();
    int[] ary = createAry();
    createScreen(HEIGHT, WIDTH, ary);
    
    Text.showCursor();
    System.out.print(Text.colorize(">", Text.WHITE));
    String input = getInput();
    while (!input.equals("quit") && !input.equals("q")) {
      if (input.equals("")) {
        createScreen(HEIGHT, WIDTH, ary);
      }
      else {
        ary = createAry();
        createScreen(HEIGHT, WIDTH, ary);
      }
      Text.go(HEIGHT+1, 1);
      Text.showCursor();
      System.out.print(Text.colorize(">", Text.WHITE));
      input = getInput();
    }
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

  public static void createScreen (int x, int y, int[] ary) {
    Text.go(1,1);
    borderVertical(x);
    borderHorizontal(y);
    printNums(ary);

  }

  public static int[] createAry() {
    int[] nums = new int[4];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*99);
    }
    return nums;
  }

  public static void printNums(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      Text.go(2, (78/5)*(i+1));
      int colour = Text.WHITE;
      if (nums[i] < 25) {
        colour = Text.RED;
      }
      if (nums[i] > 75) {
        colour = Text.GREEN;
      }
      System.out.print(Text.colorize(""+nums[i], colour));
    }
  }

  public static String getInput() {
    Scanner in = new Scanner(System.in);
    return in.nextLine();
  }
}
