public class Tester {
  public static void main(String[] args) {
    SuperArray SA = new SuperArray();
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.size());

    SA.add("print");
    SA.add("hello");
    SA.add("world");
    SA.add("why");
    SA.add("not food");
    SA.add("more");
    SA.add("max");
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.size());

    SA.remove(2);
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.size());

    // SA.add("null");
    // System.out.println(SA);
    // System.out.println(SA.toStringDebug());
    // System.out.println(SA.size());
  }
}
