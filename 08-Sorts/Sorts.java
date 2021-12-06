import java.util.Arrays;
public class Sorts{
  public static void main(String[] args) {

    int times = Integer.parseInt(args[1]);
    if (args[0].equals("bubble")) {
      // Size Sort
      int[]aryTest = new int[times];
      for (int i = 0; i < times; i++) {
          int x = (int)(Math.random()*100)-50;
          aryTest[i] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        Arrays.sort(aryTest);
        bubbleSort(ary);
        test(ary, aryTest);
      System.out.println("BubbleSort: Random Complete");

      // same sort
      int[]aryTest1 = new int[times];
      int x = (int)(Math.random()*100)-50;
      for (int i = 0; i < times; i++) {
          aryTest1[i] = x;
        }
        int[]ary1 = Arrays.copyOfRange(aryTest1, 0, aryTest1.length);
        Arrays.sort(aryTest1);
        bubbleSort(ary1);
        test(ary1, aryTest1);
      System.out.println("BubbleSort: Same Complete");

      // reverse sort
      int[]aryTest2 = new int[times];
      for (int i = 0; i < times; i++) {
          int y = (int)(Math.random()*100)-50;
          aryTest2[i] = y;
        }
        int[]ary2 = Arrays.copyOfRange(aryTest2, 0, aryTest2.length);
        aryTest2 = reverse(aryTest2);
        ary2 = reverse(ary2);
        Arrays.sort(aryTest2);
        bubbleSort(ary2);
        test(ary2, aryTest2);
      System.out.println("BubbleSort: Reverse Complete");

      // Increase sort
      int[]aryTest3 = new int[times];
      for (int i = 0; i < times; i++) {
          int y = (int)(Math.random()*100)-50;
          aryTest[i] = y;
        }
        int[]ary3 = Arrays.copyOfRange(aryTest3, 0, aryTest3.length);
        Arrays.sort(aryTest3);
        Arrays.sort(ary3);
        bubbleSort(ary3);
        test(ary3, aryTest3);
      System.out.println("BubbleSort: Increase Complete");
    }


    if (args[0].equals("selection")) {
      // Size Sort
      int[]aryTest = new int[times];
      for (int i = 0; i < times; i++) {
          int x = (int)(Math.random()*100)-50;
          aryTest[i] = x;
        }
        int[]ary = Arrays.copyOfRange(aryTest, 0, aryTest.length);
        Arrays.sort(aryTest);
        selectionSort(ary);
        test(ary, aryTest);
      System.out.println("selectionSort: Random Complete");

      // same sort
      int[]aryTest1 = new int[times];
      int x = (int)(Math.random()*100)-50;
      for (int i = 0; i < times; i++) {
          aryTest1[i] = x;
        }
        int[]ary1 = Arrays.copyOfRange(aryTest1, 0, aryTest1.length);
        Arrays.sort(aryTest1);
        selectionSort(ary1);
        test(ary1, aryTest1);
      System.out.println("selectionSort: Same Complete");

      // reverse sort
      int[]aryTest2 = new int[times];
      for (int i = 0; i < times; i++) {
          int y = (int)(Math.random()*100)-50;
          aryTest2[i] = y;
        }
        int[]ary2 = Arrays.copyOfRange(aryTest2, 0, aryTest2.length);
        aryTest2 = reverse(aryTest2);
        ary2 = reverse(ary2);
        Arrays.sort(aryTest2);
        selectionSort(ary2);
        test(ary2, aryTest2);
      System.out.println("selectionSort: Reverse Complete");

      // Increase sort
      int[]aryTest3 = new int[times];
      for (int i = 0; i < times; i++) {
          int y = (int)(Math.random()*100)-50;
          aryTest[i] = y;
        }
        int[]ary3 = Arrays.copyOfRange(aryTest3, 0, aryTest3.length);
        Arrays.sort(aryTest3);
        Arrays.sort(ary3);
        selectionSort(ary3);
        test(ary3, aryTest3);
      System.out.println("selectionSort: Increase Complete");
    }

    else {
      int[] ary = {1, 2, 3, 1};
      insertionSort(ary);
      System.out.println(Arrays.toString(ary));
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

  public static void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i++ ) {
      if (data[i] < data[i-1]) {
        System.out.println();
        int x = data[i];
        int j = i-1;
        while(data[j] > x && j >= 0 ) {
          data[j+1] = data[j];
          j--;
        }
        data[j]= x;
      }
    }
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

  public static void test(int[] ary, int[] aryTest) {
    if (!isEqual(ary, aryTest)) {
      System.out.println(Arrays.toString(ary));
      System.out.println(Arrays.toString(aryTest));
      System.out.println("Error");
      System.exit(1);
    }
  }
}
