import java.util.*;

public class ConvertFeet {
    public static void main(String[] args) {
		
		//taking input of distance in feet
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
		
		//converting feet to yards
        double yards = feet / 3;
		
		//converting yards to miles
        double miles = yards / 1760;
        System.out.println("The distance in feet is "+ feet +" in yards is  " + yards + " and in miles is  " + miles );
    }
}
