import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Wrapper {
  public static void main(String[] args) {
    if (args[1].equals("1")){
      part1(args[0]);
    }
    if (args[1].equals("2")) {
      part2(args[0]);
    }
  }

  public static void part1(String file){
    int total = 0;
    try {
      File f = new File(file);
      Scanner input = new Scanner(f);
      while (input.hasNextLine()){
        String x = input.nextLine();
        String[]nums = x.split("x");
        int l = Integer.parseInt(nums[0]);
        int w = Integer.parseInt(nums[1]);
        int h = Integer.parseInt(nums[2]);
        int a = l*w;
        int b = l*h;
        int c = w*h;
        int small = a;
        if (small > b) {
          small = b;
        }
        if (small > c) {
          small = c;
        }

        total += (2*a)+(2*b)+(2*c)+small;
      }
    }  catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }

    System.out.println(total);
  }

  public static void part2(String file) {
    int total = 0;
    try {
      File f = new File(file);
      Scanner in = new Scanner(f);
      while (in.hasNextLine()) {
        String x = in.nextLine();
        String[]nums = x.split("x");
        int[]nums1 = new int[3];
        nums1[0] = Integer.parseInt(nums[0]);
        nums1[1] = Integer.parseInt(nums[1]);
        nums1[2] = Integer.parseInt(nums[2]);
        Arrays.sort(nums1);

        total += (nums1[0]*2) + (nums1[1]*2) + (nums1[0]*nums1[2]*nums1[1]);
      }
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    System.out.println(total);
  }

}
