public class Tester {
  public static void main(String[] args) {
    SuperArray SA = new SuperArray();
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.size());
    SA.add("foo");
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.size());
    SA.add("null");
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.size());
  }
}
