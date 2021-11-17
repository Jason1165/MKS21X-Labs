import java.util.ArrayList;
public class ArrayListPractice {

  public static void main(String[] args) {
    ArrayList<String> test = new ArrayList<String>();
    for (int i = 0; i < 200000; i++) {
      if (Math.random() < 0.15) {
        test.add("");
      }
      else {
        test.add("" + (int)(Math.random()*10));
      }
    }
    System.out.println(test);
    System.out.println(replaceEmpty(test));
    // System.out.println(makeReversedList(test));
    // ArrayList<String>test1 = makeReversedList(test);
    // System.out.println(test1);
    // for (int i = 0; i < test.size(); i++) {
    //   if (test.get(i) != test1.get(test.size()-i-1)) {
    //     System.out.println("What went wrong");
    //   }
    //   else {
    //     System.out.println("Good");
    //   }
    // }
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
    return ans;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //when one list is longer than the other, just append the remaining values to the end.
    ArrayList<String>ans = new ArrayList<String>();
    return ans;
  }

}
