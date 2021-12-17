import java.util.*;

public class OrderedTester{
  public static boolean DEBUG = true;

  public static void println(String s){
    if(DEBUG){
      System.out.println(s);
    }
  }

  public static boolean compare(OrderedArrayList<Integer> a, ArrayList<Integer> b) {
    Collections.sort(b);
    int dec = 0;
    for (int i = 0; i < b.size(); i++) {
      if (b.get(i) == null) {
        dec++;
      }
      else {
        if (!a.get(i).equals(b.get(i-dec))) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String TEST;
    int testn = 1;
    ArrayList<Integer> correctNums;
    OrderedArrayList<Integer> nums;

    TEST = "COnstruction";
    correctNums = new ArrayList<Integer>();
    nums = new OrderedArrayList<Integer>();
    try{
      if( compare(nums,correctNums) ) {
      }else{
        println("Failed "+TEST);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }


    correctNums = new ArrayList<Integer>();
    nums = new OrderedArrayList<Integer>();
    TEST = "add many to random index (not end)";
    try{
      for(int i = 0; i < 5000; i++){
        int ind = (int)(Math.random()*50)-25;
        int x = (int)(Math.random()*10000);
        correctNums.add(x);
        nums.add(ind, x);
      }

      if( compare(nums,correctNums) ) {
      }else{
        println("Failed "+TEST);
      }

    }catch(RuntimeException e){
        println("Failed "+TEST+ " RuntimeException");
        if(DEBUG)e.printStackTrace();
    }

  }
}
