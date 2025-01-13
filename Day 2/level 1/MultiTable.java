import java.util.*;

public class MultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
