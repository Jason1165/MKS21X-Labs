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

  public void add(String word) {

  }

  public String toString() {
    String ans = "[";
    for (int i = 0; i < size; i++) {
      ans += this.data[i];
      if (i+1 != size) {
        ans += ", ";
      }
    }
    return ans += "]";
  }

  public String toStringDebug() {
    String ans = "[";
    for (int i = 0; i < data.length; i++) {
      ans += this.data[i];
      if (i+1 != size) {
        ans += ", ";
      }
    }
    return ans += "]";
  }

}
