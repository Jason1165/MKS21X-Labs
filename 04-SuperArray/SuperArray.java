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
    this.data[size] = word;
    this.size ++;
  }

  public String toString() {
    String ans = "[";
    for (int i = 0; i < size; i++) {
      if (this.data[i] != null) {
        ans += '"' + this.data[i] + '"';
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
        ans += '"' + this.data[i] + '"';
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

}
