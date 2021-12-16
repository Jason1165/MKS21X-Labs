import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int initialCapacity) {
    super(initialCapacity);
  }

  public boolean add (T e) {
    if (e == null) {
      throw new IllegalArgumentException("IllegalArgumentException");
    }
    boolean bool = super.add(e);
    return bool;
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("IllegalArgumentException");
    }
    super.add(index, element);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("IllegalArgumentException");
    }
    T bool = super.set(index, element);
    return bool;
  }

}
