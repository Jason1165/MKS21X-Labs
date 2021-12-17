import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  private int whereToPlace(T value){
    /*return the index that the value should be placed
    when inserting into the OrderedArrayList .*/
    int loc = 0;
    if (this.size() == 0) {
      loc = 0;
    }
    else {
      for (int i = 0; i < this.size(); i++) {
        if (value.compareTo(this.get(i)) > 0) {
          // System.out.println(i);
          loc = i;
        }
      }
    }
    return loc+1;
  }

}
