import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangles {
  public static void main(String[] args) {
    System.out.println(Triangle1());

  }

  public static int Triangle1() {
    int num = 0;

    try {
      File file = new File("Triangle.txt");
      Scanner input = new Scanner(file);
      while (input.hasNextInt()){
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a+b > c && b+c > a && a+c > b) {
          num++;
        }

      }
      input.close();
      //releases the file from your program
    } catch (FileNotFoundException ex) {
            //File not found
      }

  return num;
  }

  

}
