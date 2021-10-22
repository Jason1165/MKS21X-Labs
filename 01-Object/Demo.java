public class Demo{
  /* more methods can go here*/

  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point origin = new Point(0, 0);
    Point perfSq = new Point(3, 4);

    System.out.println(distance(P1,P2)); //call1
    System.out.println(distance(origin, perfSq));
    // System.out.println(Point.distance(P1,P2)); //call 2
    // System.out.println(P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }

  public static double distance(Point coor1, Point coor2) {
    double hor = Math.abs(coor1.getX() - coor2.getX());
    double ver = Math.abs(coor1.getX() - coor2.getY());
    return Math.hypot(hor, ver);
  }
 }
