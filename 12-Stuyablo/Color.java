public class Color {
  public static final int x = 80;
  public static final int y = 30;

  public static void main(String[] args) {
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);
    for (int i = 0; i < 80; i++) {
      CMYK(i);
    }
    Text.go(30,1);
    for (int i = 0; i < 80; i++) {
      CMYK(i);
    }
    for (int i = 0; i < 30; i++) {
      Text.go(i, 1);
      CMYK(i-1);
      Text.go(i, 80);
      CMYK(i-1);
    }

    Text.go(1, 1);
    System.out.print(Text.colorize(" ", Text.WHITE + Text.BACKGROUND));
    Text.go(y, 1);
    System.out.print(Text.colorize(" ", Text.WHITE + Text.BACKGROUND));
    Text.go(y, x);
    System.out.print(Text.colorize(" ", Text.WHITE + Text.BACKGROUND));
    Text.go(1, x);
    System.out.print(Text.colorize(" ", Text.WHITE + Text.BACKGROUND));


    int[] nums = new int[4];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int)(Math.random()*99);
    }

    for (int i = 0; i < nums.length; i++) {
      Text.go(2, (i*x)/4 + 4);
      int colour = Text.WHITE;
      if (nums[i] < 25) {
        colour = Text.RED;
      }
      if (nums[i] > 75) {
        colour = Text.GREEN;
      }
      System.out.print(Text.colorize(""+nums[i], colour));
    }
    Text.showCursor();
    Text.go(31, 1);
  }

  public static void CMYK (int i) {
    if (i%4 == 0) System.out.print(Text.colorize(" ", Text.CYAN + Text.BACKGROUND));
    if (i%4 == 1) System.out.print(Text.colorize(" ", Text.MAGENTA + Text.BACKGROUND));
    if (i%4 == 2) System.out.print(Text.colorize(" ", Text.YELLOW + Text.BACKGROUND));
    if (i%4 == 3) System.out.print(Text.colorize(" ", Text.WHITE + Text.BACKGROUND));
  }
}
