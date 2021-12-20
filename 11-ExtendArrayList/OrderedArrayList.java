import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public void add(int index, T element) {
    index = this.whereToPlace(element);
    super.add(index, element);
  }

  public T set (int index, T element) {
    T temp = this.remove(index);
    index = this.whereToPlace(element);
    super.add(index, element);
    return temp;
  }

  public boolean add(T element) {
    add(0, element);
    return true;
  }

  private int whereToPlace(T value){
    /*return the index that the value should be placed
    when inserting into the OrderedArrayList .*/
    int loc = 0;
    if (this.size() == 0 || value == null) {
      return loc;
    }
    else {
      for (int i = 0; i < this.size(); i++) {
        if (value.compareTo(this.get(i)) > 0) {
          // System.out.println(i);
          loc = i+1;
        }
      }
    }
    return loc;
  }

}
