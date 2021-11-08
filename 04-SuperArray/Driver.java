public class Driver {
  public static void main(String[] args) {
    SuperArray SA = new SuperArray();
    SA.add("cero1");
    SA.add("cero2");
    SA.add("cero3");
    SA.add("cero4");
    SA.add("cero5");
    SA.add("seis");
    System.out.println(SA.toString());
    System.out.println(SA.toStringDebug());
    // System.out.println(SA.indexOf("cero"));
    // System.out.println(SA.lastIndexOf("cero"));
    // System.out.println(SA.indexOf("idk"));
    // System.out.println(SA.lastIndexOf("idk"));
    // System.out.println(SA.indexOf("seis"));
    // System.out.println(SA.lastIndexOf("seis"));
    // System.out.println(SA.remove(5));
    // System.out.println(SA.size());
    // System.out.println(SA.remove(5));
    // System.out.println(SA.remove(2));
    System.out.println(SA.toStringDebug());
    SA.add(0, "test");
    System.out.println(SA.toString());
    // SA.add(-1, "false");
    // SA.add(10, "false");
    SA.add(4, "false");
    System.out.println(SA.toString());
    SA.add("not6");
    SA.add("not7");
    // SA.add("not8");
    // SA.add("not9");
    System.out.println(SA.toStringDebug());
    SA.add(9, "not10");
    System.out.println(SA.toStringDebug());
  }
}
