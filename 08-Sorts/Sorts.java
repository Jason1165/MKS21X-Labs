import java.util.Arrays;
public class Sorts{
  public static void main(String[] args) {

    int times = Integer.parseInt(args[1]);
    if (args[0].equals("0")) {
      // Size Sort
      for (int i = 0; i <= times; i++) {
        int[]aryTest = new int[i];
        for (int j = 0; j < i; j++) {
          int x = (int)(Math.random()*100)-50;
          aryTest[j] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        Arrays.sort(aryTest);
        bubbleSort(ary);
        test(ary, aryTest, i);
      }
      System.out.println("BubbleSort: Random Complete");

      // same sort
      for (int i = 0; i <= times; i++) {
        int[]aryTest = new int[i];
        int x = (int)(Math.random()*100)-50;
        for (int j = 0; j < i; j++) {
          aryTest[j] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        Arrays.sort(aryTest);
        bubbleSort(ary);
        test(ary, aryTest, i);
      }
      System.out.println("BubbleSort: Same Complete");

      // reverse sort
      for (int i = 0; i <= times; i++) {
        int[]aryTest = new int[i];
        for (int j = 0; j < i; j++) {
          int x = (int)(Math.random()*100)-50;
          aryTest[j] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        aryTest = reverse(aryTest);
        ary = reverse(ary);
        Arrays.sort(aryTest);
        bubbleSort(ary);
        test(ary, aryTest, i);
      }
      System.out.println("BubbleSort: Reverse Complete");

      // Increase sort
      for (int i = 0; i <= times; i++) {
        int[]aryTest = new int[i];
        for (int j = 0; j < i; j++) {
          int x = (int)(Math.random()*100)-50;
          aryTest[j] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        Arrays.sort(aryTest);
        Arrays.sort(ary);
        bubbleSort(ary);
        test(ary, aryTest, i);
      }
      System.out.println("BubbleSort: Increase Complete");
    }


    if (args[0].equals("1")) {
      // Size Sort
      for (int i = 0; i <= times; i++) {
        int[]aryTest = new int[i];
        for (int j = 0; j < i; j++) {
          int x = (int)(Math.random()*100)-50;
          aryTest[j] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        Arrays.sort(aryTest);
        selectionSort(ary);
        test(ary, aryTest, i);
      }
      System.out.println("selectionSort: Random Complete");

      // same sort
      for (int i = 0; i <= times; i++) {
        int[]aryTest = new int[i];
        int x = (int)(Math.random()*100)-50;
        for (int j = 0; j < i; j++) {
          aryTest[j] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        Arrays.sort(aryTest);
        selectionSort(ary);
        test(ary, aryTest, i);
      }
      System.out.println("selectionSort: Same Complete");

      // reverse sort
      for (int i = 0; i <= times; i++) {
        int[]aryTest = new int[i];
        for (int j = 0; j < i; j++) {
          int x = (int)(Math.random()*100)-50;
          aryTest[j] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        aryTest = reverse(aryTest);
        ary = reverse(ary);
        Arrays.sort(aryTest);
        selectionSort(ary);
        test(ary, aryTest, i);
      }
      System.out.println("selectionSort: Reverse Complete");

      // Increase sort
      for (int i = 0; i <= times; i++) {
        int[]aryTest = new int[i];
        for (int j = 0; j < i; j++) {
          int x = (int)(Math.random()*100)-50;
          aryTest[j] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        Arrays.sort(aryTest);
        Arrays.sort(ary);
        selectionSort(ary);
        test(ary, aryTest, i);
      }
      System.out.println("selectionSort: Increase Complete");
    }

  }

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    boolean inOrder = false;
    int i = data.length;
    while (!inOrder && i >= 0) {
        inOrder = true;
        for (int k = 0; k < i-1; k++) {
          if (data[k] > data[k+1]) {
            int x = data[k];
            int y = data[k+1];
            data[k] = y;
            data[k+1] = x;
            inOrder = false;
          }
          // System.out.println(Arrays.toString(data));
        }
        i--;
        // System.out.println(Arrays.toString(data));
    }
    // System.out.println(Arrays.toString(data));
  }

  /**Selection sort
  */
  public static void selectionSort(int[] ary) {
    for (int i = 0; i < ary.length; i++) {
      int min = ary.length-1;
      for (int j = i; j < ary.length; j++) {
        if (ary[min] > ary[j]) {
          min = j;
        }
      }
      int x = ary[i];
      int y = ary[min];
      ary[i] = y;
      ary[min] = x;
    }
    // System.out.println(Arrays.toString(ary));
  }


  public static boolean isEqual(int[] ary1, int[] ary2) {
    for (int i = 0; i < ary1.length; i++) {
      if (ary1[i] != ary2[i]) {
        return false;
      }
    }
      return true;
  }


  public static int[] reverse(int[] ary) {
    int[] ans = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      ans[i] = ary[ary.length-i-1];
    }
    return ans;
  }

  public static void test(int[] ary, int[] aryTest, int i) {
    if (!isEqual(ary, aryTest)) {
      System.out.println(Arrays.toString(ary));
      System.out.println(Arrays.toString(aryTest));
      System.out.println("Error");
      System.out.println("Size: " + i);
      System.exit(1);
    }
  }
}
