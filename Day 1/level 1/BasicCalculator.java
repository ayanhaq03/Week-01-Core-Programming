import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//taking input of two number from user
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
		
		//addition operation
        int add = number1 + number2;
		//subtraction operation
        int sub = number1 - number2 ;
		//multiplication operation
        int multi = number1 * number2;
		//division operation
        int div = number1 / number2;
		
		System.out.println("The addition,subtraction,multiplication and division value of 2 numbers "+ number1 +" and " + number2 +" is "+ add + ","+ sub +","+ multi +"and "+ div);
    }
}
