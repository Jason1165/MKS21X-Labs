public class Demo{

  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point origin = new Point(0, 0);
    Point perfSq = new Point(3, -4);
    Point perfSq2 = new Point(-5, 12);
    Point perfSq3 = new Point(Math.sqrt(2), Math.sqrt(2));
    Point perfSq4 = new Point(-7, -24);

    System.out.println("static distance from class Demo");
    System.out.println(distance(P1,P2)); //call1
    System.out.println(distance(origin, perfSq));
    System.out.println(distance(origin, perfSq2));
    System.out.println(distance(origin, perfSq3));
    System.out.println(distance(origin, perfSq4));

    System.out.println("\nstatic distance from class Point");
    System.out.println(Point.distance(P1,P2)); //call 2
    System.out.println(Point.distance(origin, perfSq));
    System.out.println(Point.distance(origin, perfSq2));
    System.out.println(Point.distance(origin, perfSq3));
    System.out.println(Point.distance(origin, perfSq4));

    System.out.println(P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }

  public static double distance(Point coor1, Point coor2) {
    double hor = Math.abs(coor1.getX() - coor2.getX());
    double ver = Math.abs(coor1.getX() - coor2.getY());
    return Math.hypot(hor, ver);
  }

 }
