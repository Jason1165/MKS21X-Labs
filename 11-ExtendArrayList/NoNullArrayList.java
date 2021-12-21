import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int initialCapacity) {
    super(initialCapacity);
  }

  @Override
  public boolean add (T e) {
    if (e == null) {
      throw new IllegalArgumentException("Value cannot be a null");
    }
    else {
      return super.add(e);
    }
  }

  @Override
  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Value cannot be a null");
    }
    else {
      super.add(index, element);
    }
  }

  @Override
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Value cannot be a null");
    }
    else {
      return super.set(index, element);
    }
  }

}
