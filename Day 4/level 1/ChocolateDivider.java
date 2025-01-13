import java.util.*; 

public class ChocolateDivider {
    // Method to calculate chocolates each child gets and the remaining chocolates
    public static int[] divideChocolates(int chocolates, int children) {
        int chocolatesPerChild = chocolates / children; // Calculating chocolates per child
        int remainingChocolates = chocolates % children; // Calculating remaining chocolates
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for chocolates and children
        System.out.println("Enter the number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.println("Enter the number of children: ");
        int children = sc.nextInt();

     
        int[] result = divideChocolates(chocolates, children);

        // Displaying the results
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
