import java.util.*;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int commonDim = b.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < commonDim; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to calculate the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to calculate the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for matrix dimensions
        System.out.println("Enter rows and columns for the first matrix:");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        System.out.println("Enter rows and columns for the second matrix:");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        // Creating random matrices
        int[][] matrix1 = createMatrix(rows1, cols1);
        int[][] matrix2 = createMatrix(rows2, cols2);

      
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Performing addition and subtraction
        if (rows1 == rows2 && cols1 == cols2) {
            System.out.println("Sum of matrices:");
            displayMatrix(addMatrices(matrix1, matrix2));

            System.out.println("Difference of matrices:");
            displayMatrix(subtractMatrices(matrix1, matrix2));
        } else {
            System.out.println("Addition and subtraction not possible (dimension mismatch).");
        }

        // Performing multiplication
        if (cols1 == rows2) {
            System.out.println("Product of matrices:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("Multiplication not possible (dimension mismatch).");
        }

        // Transpose of matrices
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));
        System.out.println("Transpose of Matrix 2:");
        displayMatrix(transposeMatrix(matrix2));

        // Determinant calculations for square matrices
        if (rows1 == cols1) {
            if (rows1 == 2) {
                System.out.println("Determinant of Matrix 1 (2x2): " + determinant2x2(matrix1));
            } else if (rows1 == 3) {
                System.out.println("Determinant of Matrix 1 (3x3): " + determinant3x3(matrix1));
            }
        }

       
    }
}
