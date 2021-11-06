public class Tester {
  public static void main(String[] args) {
    SuperArray SA = new SuperArray();
    SuperArray Test1 = new SuperArray(0);
    SuperArray SA2 = new SuperArray();

    // System.out.println(SA);
    // System.out.println(SA.toStringDebug());
    // System.out.println(SA.size());
    // String[] x = {"not zero", "not one", "not two", "not three", "not for", "not fi", "not se", "not sev"};
    // SA.add("zero"); SA.add("one"); SA.add("two"); SA.add("three"); SA.add("four"); SA.add("five"); SA.add("six");
    // System.out.println(SA);
    // System.out.println(SA.toStringDebug());
    // System.out.println(SA.size());

    // SA2.add("zero"); SA2.add("one"); SA2.add("two"); SA2.add("three"); SA2.add("four"); SA2.add("five"); SA2.add("six");
    // System.out.println(SA2);
    // System.out.println(SA2.toStringDebug());
    // System.out.println(SA2.size());
    System.out.println(Test1.toStringDebug());
    Test1.add("cero");
    System.out.println(Test1.toStringDebug());
    Test1.add("uno");
    System.out.println(Test1.toStringDebug());
    Test1.add("dos");
    System.out.println(Test1.toStringDebug());
    Test1.add("tres");
    System.out.println(Test1.toStringDebug());
    System.out.println(Test1.remove(2));
    System.out.println(Test1.toStringDebug());
    // System.out.println(SA2.remove(2));
    // System.out.println(SA2);

    // System.out.println(SA);
    // System.out.println(SA.toStringDebug());
    // System.out.println(SA.size());
    // System.out.println("\nPhase Two Testing");
    // System.out.println("\nGet all the Values");
    //
    // for (int i = 0; i < SA.size(); i++) {
    //   System.out.println(SA.get(i));
    // }
    //
    // System.out.println("\nSet all the values");
    // for (int i = 0; i < SA.size(); i++){
    //   System.out.println(SA.set(i, x[i+1]));
    // }
    //
    // System.out.println("\nRight shift one");
    // for (int i = 0; i < SA.size()-1; i++) {
    //   System.out.println(SA.set(i, SA.get(i+1)));
    // }
    //
    // SA.set(SA.size()-1, "NOPE!");
    // System.out.println(SA.toString());

  }
}
