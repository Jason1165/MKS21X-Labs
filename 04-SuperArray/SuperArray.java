public class SuperArray {
  // fields
  private String[] data;
  private int size;

  // constructors
  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String word) {
    this.data[size] = word;
    this.size ++;
    return true;
  }

  public void remove(int loc) {
    for (int i = loc; i <= size; i++) {
      this.data[i] = this.data[i+1];
    }
  }

  public String toString() {
    String ans = "[";
    for (int i = 0; i < size; i++) {
      if (this.data[i] != null) {
        ans += this.data[i];
      }
      else {
        ans += this.data[i];
      }
      if (i+1 != size) {
        ans += ", ";
      }
    }
    return ans += "]";
  }

  public String toStringDebug() {
    String ans = "[";
    for (int i = 0; i < data.length; i++) {
      if (this.data[i] != null) {
        ans += this.data[i];
      }
      else {
        ans += this.data[i];
      }
      if (i+1 != data.length) {
        ans += ", ";
      }
    }
    return ans += "]";
  }

  public String get(int index) {
    if (index < 0 || index >= size) {
      System.out.println("SuperArray.java Error for GET, index out of bounds at " + index);
      return null;
    }
      return this.data[index];
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size) {
      System.out.println("SuperArray.java Error for SET, index out of bounds at " + index);
      return null;
    }
    String ori = this.data[index];
    this.data[index] = element;
    return ori;
    }
}
