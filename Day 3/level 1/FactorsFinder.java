import java.util.*;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = new int[10];
        int index = 0, maxIndex = 10;

        // Finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxIndex) {
                    maxIndex *= 2;
                    factors = Arrays.copyOf(factors, maxIndex);
                }
                factors[index++] = i;
            }
        }

        System.out.println("Factors: " + Arrays.toString(Arrays.copyOf(factors, index)));
    }
}