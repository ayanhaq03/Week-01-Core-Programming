import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
		
		//taking input of base and height of triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = input.nextDouble();
		
		//calculating area
        double areaInSqCm = 0.5 * base * height;
		double areaInSqInches = areaInSqCm / 2.54 ;
        System.out.println("The area of the triangle in square cm is " + areaInSqCm + " area of triangle in square inches is "+ areaInSqInches);
    }
}
