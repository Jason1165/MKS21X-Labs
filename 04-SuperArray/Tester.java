public class Tester {
  public static void main(String[] args) {
    SuperArray SA = new SuperArray();
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.size());
    String[] x = {"not zero", "not one", "not two", "not three", "not for", "not fi", "not se", "not sev"};

    SA.add("zero");
    SA.add("one");
    SA.add("two");
    SA.add("three");
    SA.add("four");
    SA.add("five");
    SA.add("six");
    System.out.println(SA);
    System.out.println(SA.toStringDebug());
    System.out.println(SA.size());
    System.out.println("\nPhase Two Testing");
    System.out.println("\nGet all the Values");
    for (int i = 0; i < SA.size(); i++) {
      System.out.println(SA.get(i));
    }

    System.out.println("\nSet all the values");
    for (int i = 0; i < SA.size(); i++){
      SA.set(i, x[i+1]);
    }

    for (int i = 0; i < SA.size(); i++) {
      System.out.println(SA.get(i));
    }

    System.out.println("\nRight shift one");
    for (int i = 0; i < SA.size()-1; i++) {
      SA.set(i, SA.get(i+1));
      System.out.println(SA.get(i));
    }

    SA.set(SA.size()-1, "NOPE!");
    System.out.println(SA.toString());

    // SA.remove(2);
    // System.out.println(SA);
    // System.out.println(SA.toStringDebug());
    // System.out.println(SA.size());

    // SA.add("null");
    // System.out.println(SA);
    // System.out.println(SA.toStringDebug());
    // System.out.println(SA.size());
  }
}
