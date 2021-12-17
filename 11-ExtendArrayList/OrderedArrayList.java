import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public int whereToPlace(T value){
    /*return the index that the value should be placed
    when inserting into the OrderedArrayList .*/
    int loc = 0;
    if (this.size() == 0) {
      loc = 0;
    }
    else {
      for (int i = 0; i < this.size(); i++) {
        if (value.compareTo(this.get(i)) == -1) {
          loc = i;
        }
      }
    }
    return loc;
  }

  public static void main(String[] args) {
    OrderedArrayList<String> test = new OrderedArrayList<String>();
    for (int i = 0; i < 26; i++) {
      String x = "" + (char)(i+65);
      test.add(x);
    }
    System.out.println(test.toString());
  }

}
