public class StringToInt {
  public static void main(String[] args) {
    // System.out.println(args[0]);
    System.out.println(stringToInt(args[0]));
  }

  public static int stringToInt(String s) {
    int ans = 0;
    int l = s.length()-1;
    for (int i = s.length()-1; i >= 0; i--) {
      int val = valueOfDigit(s.charAt(i));
      if (val == -1) {
        ans = ans * val;
      } else {
        ans += val*(Math.pow(10, l-i));  
      }
      // System.out.println(val);
    }
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
