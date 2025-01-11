import java.util.*;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int children = sc.nextInt();
        
        // Calculate chocolates per child and remainder
        int perChild = chocolates / children;
        int remaining = chocolates % children;
        
        // Print result
        System.out.println("The number of chocolates each child gets is " + perChild + " and the number of remaining chocolates are " + remaining);
    }
}
