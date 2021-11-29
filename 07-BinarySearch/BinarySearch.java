import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {
    int result;
    result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
    System.out.println(result);//should be 3
    result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
    System.out.println(result);//should be -1
    result = binarySearch(new int[]{0,1,2,3,4,5,6},0);
    System.out.println(result);//should be 0
    //...
    result = binarySearch(new int[]{0,1,2,3,4,5,6},6);
    System.out.println(result);//should be 6
  }

  public static int binarySearch(int[] data, int target) {
    int min = 0;
    int max = data.length-1;
    int mid = (min+max)/2;
    while (min <= max) {
      if (data[mid] == target) {
        return mid;
      }
      else if (target < data[mid]) {
        System.out.println("Greater: " + min + "\t" + mid + "\t" + max);
        max = mid-1;
        mid = (min+max)/2;
        System.out.println("Greater: " + min + "\t" + mid + "\t" + max);
      }
      else if (target > data[mid]) {
        System.out.println("Lesser: " + min + "\t" + mid + "\t" + max);
        min = mid+1;
        mid = (min+max)/2;
        System.out.println("Lesser: " + min + "\t" + mid + "\t" + max);
      }

    }
    return -1;
  }

}
