import java.util.*;

public class NaturalNoSumUsingFor{
    public static void main(String[] args) {
	
	//taking input from user
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            
            int sum1 = 0;
			//sum using loop
            for (int i = 1; i <= number; i++) {
                sum1 += i;
            }

            // sum using Using formula
            int sum2 = number * (number + 1) / 2;

          
            System.out.println("Sum using for loop: " + sum1);
            System.out.println("Sum using formula: " + sum2);
			
            if (sum1 == sum2) {
                System.out.println("Both sum are correct ");
            }
        }
		}
		}