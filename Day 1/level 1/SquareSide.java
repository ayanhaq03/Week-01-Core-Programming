import java.util.*;

public class SquareSide {
    public static void main(String[] args) {
		 
		 //taking perimeter as input 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
		
		//calculating side using perimeter
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
