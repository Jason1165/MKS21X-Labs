import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Triangles {
  public static void main(String[] args) {
    if (args[1].equals("1")) {
      Triangle1(args[0]);
    }
    if (args[1].equals("2")) {
      Triangle2(args[0]);
    }

  }

  public static void Triangle1(String argss) {
    int num = 0;

    try {
      File file = new File(argss);
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

  System.out.println(num);
  }

  public static void Triangle2(String argggs){
    int num = 0;
    try{
      File file = new File(argggs);
      Scanner input = new Scanner(file);
      while (input.hasNextInt()){
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();


        int a2 = input.nextInt();
        int b2 = input.nextInt();
        int c2 = input.nextInt();

        int a3 = input.nextInt();
        int b3 = input.nextInt();
        int c3 = input.nextInt();
        if(a1+a2>a3 && a1+a3>a2 && a2+a3>a1) {
          num++;
        }
        if(b1+b2>b3 && b2+b3>b1 && b3+b1>b2) {
          num++;
        }
        if(c1+c2>c3 && c1+c3>c2 && c2+c3>c1) {
          num++;
        }

      }

    } catch (FileNotFoundException ex) {
      //File not found
    }

    System.out.println(num);
  }

}
