public class StringToInt {
  public static void main(String[] args) {
    System.out.println(valueOfDigit('5'));
  }

  public static int stringToInt(String s) {
    int ans = 1;
    return ans;
  }

  public static int valueOfDigit(char c) {
    int ans = 0;
    if (c == 45) {
      ans = -1;
    }
    else if (48 <= c && c <= 57) {
      ans = c-48;
    }
    return ans;
  }

}
