public class Bro {
  public static void main(String args[]){
  SuperArray alist = new SuperArray();
  alist.add("Mario");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());

  alist.add("Samus");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());

  alist.add("Ash");
  alist.add("Link");
  alist.add("Kirby");
  //displaying elements
  System.out.println(alist);
  System.out.println(alist.toStringDebug());
}
}
