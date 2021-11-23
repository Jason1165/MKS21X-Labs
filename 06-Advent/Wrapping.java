import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Wrapping {
  public static void main(String[] args) {
    if (args[1].equals("1")){
      part1(args[0]);
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

}
