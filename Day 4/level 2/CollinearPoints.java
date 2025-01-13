import java.util.*;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for three points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();

        // Check collinearity using slope method
        boolean isCollinearSlope = checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear (using slope)? " + isCollinearSlope);

        // Check collinearity using area of triangle method
        boolean isCollinearArea = checkCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear (using area)? " + isCollinearArea);
    }

    // Method to check collinearity using slope
    public static boolean checkCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of a triangle
    public static boolean checkCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }
}
