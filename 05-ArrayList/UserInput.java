import java.util.Scanner;
import java.util.ArrayList;

public class UserInput {
  public static void main(String[] args) {
    ArrayList<Double>listOfDoubles = new ArrayList<Double>();
    Scanner in = new Scanner(System.in);
    Scanner in1 = new Scanner(System.in);
    System.out.println("Enter a non negative number. A negative number will end the program:");
    while (in.hasNext()) {

      try {
        double x = Double.parseDouble(in.next());
        if (x >= 0) {
          listOfDoubles.add(x);
          // System.out.println("Successfully added: " + x);
          System.out.println("Enter a non negative number. A negative number will end the program:");
        }

        else if (x <= 0) {
          in.close();
          // System.out.println("Successfully closed");
          break;
        }
      }catch(Exception e) {
        System.out.println("Enter a non negative number. A negative number will end the program:");
      }
    }

    double max = listOfDoubles.get(listOfDoubles.size()-1);
    double min = listOfDoubles.get(listOfDoubles.size()-1);
    for (int i = 0; i < listOfDoubles.size(); i++){
      
    }

    System.out.println("You entered: " + listOfDoubles);
    System.out.println("Min value: " + min);
    System.out.println("Max value: " + max);

  }
}
