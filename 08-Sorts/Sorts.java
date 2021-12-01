import java.util.Arrays;
public class Sorts{
  public static void main(String[] args) {
    int[] test1 = {5, 1 , 12, -5, 16};
    int[] test2 = {2, 3, 4, 5, 1};
    int[] test3 = {6, 1, 2, 3, 4, 5};
    int[] test4 = {0, 1, 2, -1, 1, 2};
    bubbleSort(test1);
    bubbleSort(test2);
    bubbleSort(test3);
    bubbleSort(test4);
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
        System.out.println(Arrays.toString(data));
    }
  }

}
