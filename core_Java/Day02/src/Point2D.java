import java.lang.Math;
class Point2D
{
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String show()
    {
        return x+" "+y;
    }

    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    public  double calculateDistance(Point2D other) {
        double a= (other.x - x)*(other.x - x);
        double b= (other.y - y)*(other.y - y);

        return Math.sqrt(a+b);
    }
}