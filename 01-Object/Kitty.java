public class Kitty {

  // fields
  private String name;
  private int age;

  // constructors
  public Kitty(String startName, int startAge){
    name = startName;
    age = startAge;
  }

  // accessor methods
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // using toString will override printing the address
  // it will give the object a string value we assign
  public String toString() {
    return "The amazing " + name;
  }

  // mutator methods
  public void changeName(String newName) {
    name = newName;
  }

  public void makeOlder() {
    age ++;
  }
}
