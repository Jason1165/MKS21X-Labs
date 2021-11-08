public class Driver {
  public static void main(String[] args) {
    SuperArray SA = new SuperArray();
    SA.add("cero");
    SA.add("cero");
    SA.add("cero");
    SA.add("cero");
    SA.add("cero");
    SA.add("seis");
    System.out.println(SA.toString());
    System.out.println(SA.toStringDebug());
    System.out.println(SA.indexOf("cero"));
    System.out.println(SA.lastIndexOf("cero"));
    System.out.println(SA.indexOf("idk"));
    System.out.println(SA.lastIndexOf("idk"));
    System.out.println(SA.indexOf("seis"));
    System.out.println(SA.lastIndexOf("seis"));
  }
}
