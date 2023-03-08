import java.util.Scanner;

public class demo {

    private double x;
    private double y;
    
    public demo() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public demo(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public double distance(demo otherPoint) {
        double distance = Math.sqrt(Math.pow(otherPoint.getX() - this.x, 2) + Math.pow(otherPoint.getY() - this.y, 2));
        return distance;
    }
    
    public double distance(double x, double y) {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance;
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        scan.close();
        demo point1 = new demo(x1, y1);
        demo point2 = new demo(x2, y2);
        
        System.out.printf("Distance between ("+x1+", "+y1+") and ("+x2+", "+y2+") is: %.2f", point1.distance(x2, y2));
    }
}