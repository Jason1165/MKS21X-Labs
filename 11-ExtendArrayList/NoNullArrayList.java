import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int initialCapacity) {
    super(initialCapacity);
  }

  public boolean add (T e) throws IllegalArgumentException {
    if (e == null) {
      // System.out.println("Guess it did not throw");
      throw new IllegalArgumentException("Cannot be a null");
    }
    else {
      // System.out.println("I tried to add " + e);
      super.add(e);
    }
    return true;
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot be a null");
    }
    super.add(index, element);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot be a null");
    }
    T bool = super.set(index, element);
    return bool;
  }

}
