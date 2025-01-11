import java.util.*;

public class CountdownWhile {
    public static void main(String[] args) {
         // Taking input from user
          
		  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number for countdown: ");
        int counter = scanner.nextInt(); 

        while (counter > 0) { // Loop until the counter reaches 1
            System.out.println(counter);
            counter--; // Decrement the counter
        }
        System.out.println("launch");
    }
}
