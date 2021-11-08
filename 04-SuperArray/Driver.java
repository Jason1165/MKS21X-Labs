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
    System.out.println(SA.indexOf("cero"));
    System.out.println(SA.lastIndexOf("cero"));
    System.out.println(SA.indexOf("idk"));
    System.out.println(SA.lastIndexOf("idk"));
    System.out.println(SA.indexOf("seis"));
    System.out.println(SA.lastIndexOf("seis"));
    System.out.println(SA.remove(5));
    System.out.println(SA.remove(5));
    System.out.println(SA.remove(2));
    System.out.println(SA.toStringDebug());

  }
}
