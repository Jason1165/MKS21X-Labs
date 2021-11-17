import java.util.ArrayList;
public class ArrayListPractice {

  public static void main(String[] args) {
    ArrayList<String> test = new ArrayList<String>();
    for (int i = 0; i < 20; i++) {
      if (Math.random() < 0.15) {
        test.add("");
      }
      else {
        test.add("" + (int)(Math.random()*10));
      }
    }

    System.out.println(test);
    System.out.println(replaceEmpty(test));
    System.out.println(makeReversedList(test));

    ArrayList<String>zero = new ArrayList<String>(10);
    System.out.println(replaceEmpty(zero));

    ArrayList<String>test1 = makeReversedList(test);
    System.out.println(test1);
    for (int i = 0; i < test.size(); i++) {
      if (test.get(i) != test1.get(test.size()-i-1)) {
        System.out.println("Error at " + i);
        System.exit(1);
      }
    }

    ArrayList<String>test2 = replaceEmpty(test);
    ArrayList<String>test3 = makeReversedList(test2);
    for (int i = 0; i < test2.size(); i++) {
      if (test2.get(i) != test3.get(test.size()-i-1)) {
        System.out.println("Error at " + i);
        System.exit(1);
      }
    }

    System.out.println("\nTesting Concat");
    ArrayList<String>A = new ArrayList<String>();
    ArrayList<String>B = new ArrayList<String>();
    for (int i = 0; i < 30; i++) {
      if (Math.random() < 0.25) {
        A.add("" + (int)(Math.random()*10));
      }
      else {
        A.add("" + (int)(Math.random()*10));
        B.add("" + (int)(Math.random()*10));
      }
    }
    System.out.println(A);
    System.out.println(B);
    System.out.println(mixLists(A, B));


  }



  public static ArrayList<String> replaceEmpty( ArrayList<String> data){
    ArrayList<String>ans = new ArrayList<String>();
    for (int i = 0; i < data.size(); i++) {
      if (data.get(i) == "") {
        ans.add("Empty");
      }
      else {
        ans.add(data.get(i));
      }
    }
    return ans;
    //return an new ArrayList that has all of the values of the original ArrayList except
    //that all empty strings are replaced with the word "Empty".
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> data){
    //return a new ArrayList that is in the reversed order of the parameter.
    ArrayList<String>ans = new ArrayList<String>();
    for (int i = data.size()-1; i >= 0; i--) {
      ans.add(data.get(i));
    }
    return ans;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //when one list is longer than the other, just append the remaining values to the end.
    ArrayList<String>ans = new ArrayList<String>();
    boolean isYes = true;
    int i = 0;
    while (isYes) {
      if (a.size() <= i && b.size() <= i) {
        isYes = false;
      }
      else {
        if (a.size() > i) {
          ans.add(a.get(i));
        }
        if (b.size() > i) {
          ans.add(b.get(i));
        }
        i++;
      }
    }

    return ans;
  }

}
