import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    // // initial test cases
    // int result;
    // result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
    // System.out.println(result);//should be 3
    // result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
    // System.out.println(result);//should be -1
    // result = binarySearch(new int[]{0,1,2,3,4,5,6},0);
    // System.out.println(result);//should be 0
    // result = binarySearch(new int[]{0,1,2,3,4,5,6},6);
    // System.out.println(result);//should be 6
    // result = binarySearch(new int[]{}, 100);//should be -1
    // System.out.println(result);
    int[] test = new int[20];
    for (int i = 0; i < 20; i++) {
      test[i] = (int)(Math.random()*10);
    }
    Arrays.sort(test);
    System.out.println(Arrays.toString(test));
    System.out.println(binarySearch(test, 6));
    // makes 20 different arrays of size i, and in each array of size i test if i[k] == k;
    for (int i = 0; i < 20; i++) {
      int[] ary = new int[i];
      for (int j = 0; j < i; j++) {
        ary[j] = j;
      }
      for (int k = 0; k < ary.length; k++) {
        if (k != binarySearch(ary, k)) {
          System.out.println("Error: " + i + "\t" + k);
        }
      }
    }

  }

  public static int binarySearch(int[] data, int target) {
    int min = 0;
    int max = data.length-1; // because index is length - 1
    int mid = (min+max)/2;
    while (min <= max) {
      if (data[mid] == target) {
        return mid;
      }
      else if (target < data[mid]) {
        // System.out.println("Greater: " + min + "\t" + mid + "\t" + max);
        max = mid-1;
        mid = (min+max)/2;
        // System.out.println("Greater: " + min + "\t" + mid + "\t" + max);
      }
      else if (target > data[mid]) {
        // System.out.println("Lesser: " + min + "\t" + mid + "\t" + max);
        min = mid+1;
        mid = (min+max)/2;
        // System.out.println("Lesser: " + min + "\t" + mid + "\t" + max);
      }

    }
    return -1;
  }

}
