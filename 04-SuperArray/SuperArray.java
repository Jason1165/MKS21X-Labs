public class SuperArray {
  // fields
  private String[] data;
  private int size;

  // constructors
  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    size = 0;
  }

  // methods
  public int size() {
    return size;
  }

  private void resize() {
    String[] dooble = new String[data.length*2 + 1];
    for (int i = 0; i < data.length; i++) {
      dooble[i] = data[i];
    }
    this.data = dooble;
  }

  public boolean add(String word) {
    if (size == data.length){
      resize();
    }
    this.data[size] = word;
    this.size ++;
    return true;
  }

  public void add(int index, String value) {
    if(index < 0 || index > size) {
      System.out.println("add: SuperArrayIndexOutOfBoundsException: " + index);
    }
    else {
      for (int i = size+1; i < index; i--) {
        data[i] = data[i-1];
      }
      data[index] = value;
      this.size ++;
    }
  }

  public String remove(int index) {
    if(index < 0 || index >= this.size){
      System.out.println("Remove SuperArrayIndexOutOfBoundsException: " + index);
      return null;
    }

    String word = this.get(index);
    for (int i = index; i <= size; i++) {
      this.data[i] = this.data[i+1];
    }

    this.size --;
    return word;
  }

  // indexOf
  public int indexOf(String target) {
    for (int i = 0; i < size; i++) {
      if(data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target) {
    for (int i = size-1; i >= 0; i--) {
      if(data[i].equals(target)) {
        return i;
      }
    }
    return -1;
  }

  // toString
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

  // set and get
  public String get(int index) {
    if (index < 0 || index >= size) {
      System.out.println("\tGet SuperArrayIndexOutOfBoundsException: " + index + "\n\tSize was: " + size);
      return null;
    }
      return this.data[index];
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size) {
      System.out.println("\tSet SuperArrayIndexOutOfBoundsException: " + index + "\n\tSize was: " + size);
      return null;
    }
    String ori = this.data[index];
    this.data[index] = element;
    return ori;
    }
}
