import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangles {
  public static void main(String[] args) {
    System.out.println(Triangle1());
    System.out.println(Triangle2());

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

  public static int Triangle2(){
    int num = 0;
    try{
      File file = new File("Triangle.txt");
      Scanner input = new Scanner(file);
      while (input.hasNextInt()){
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();
        if(a1+b1>c1 && a1+c1>b1 && c1+b1>a1) {
          num++;
        }

        int a2 = input.nextInt();
        int b2 = input.nextInt();
        int c2 = input.nextInt();
        if(a2+b2>c2 && a2+c2>b2 && c2+b2>a2) {
          num++;
        }

        int a3 = input.nextInt();
        int b3 = input.nextInt();
        int c3 = input.nextInt();
        if(a3+b3>c3 && a3+c3>b3 && c3+b3>a3) {
          num++;
        }

      }

    } catch (FileNotFoundException ex) {
      //File not found
    }

    return num;
  }

}
