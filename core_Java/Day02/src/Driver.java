import java.util.*;
class Driver{
    public static void main(String[] args){

        System.out.println("Enter the co-ordinates of first point:");
        Scanner sc= new Scanner(System.in);

        Point2D p;
        p= new Point2D(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter the co-ordinates of second point:");

        Point2D p2;
        p2= new Point2D(sc.nextDouble(), sc.nextDouble());

        if (p.isEqual(p2))
            System.out.println("Points are same !!");
        else
            System.out.println("Distance between both point: "+p.calculateDistance(p2));


        sc.close();
    }
}