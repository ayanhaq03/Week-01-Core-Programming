import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
         // Taking input from user
          
		  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number for countdown: ");
        int counter = scanner.nextInt(); 

         for(int i = counter ; i >= 1 ; i-- ){ // Loop until the counter reaches 1
            System.out.println(i);
           
        }
        System.out.println("launch");
    }
}