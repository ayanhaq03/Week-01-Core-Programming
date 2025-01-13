import java.util.*;

public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

   
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubes(factors));
        System.out.println("Is Perfect Number: " + isPerfect(num, factors));
        System.out.println("Is Abundant Number: " + isAbundant(num, factors));
        System.out.println("Is Deficient Number: " + isDeficient(num, factors));
    }

    // Method to find factors
    public static int[] findFactors(int num) {
        List<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factorList.add(i);
        }
        return factorList.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        return Arrays.stream(factors).max().orElse(1);
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        return Arrays.stream(factors).sum();
    }

    // Method to find the product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int num, int[] factors) {
        int sum = Arrays.stream(factors).filter(f -> f != num).sum();
        return sum == num;
    }

    // Method to check if a number is abundant
    public static boolean isAbundant(int num, int[] factors) {
        int sum = Arrays.stream(factors).filter(f -> f != num).sum();
        return sum > num;
    }

    // Method to check if a number is deficient
    public static boolean isDeficient(int num, int[] factors) {
        int sum = Arrays.stream(factors).filter(f -> f != num).sum();
        return sum < num;
    }
}
