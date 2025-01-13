import java.util.*;

public class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] oneDArray = new int[rows * cols];
        int index = 0;

        // Input for 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                oneDArray[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array: " + Arrays.toString(oneDArray));
    }
}