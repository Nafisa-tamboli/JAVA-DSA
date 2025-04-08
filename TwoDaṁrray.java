import java.util.Scanner;

public class TwoDaṁrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare a 2D array with 3 rows and 3 columns
        int[][] matrix = new int[3][3];

        // Input elements
        System.out.println("Enter 9 elements for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print elements
        System.out.println("Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Find sum of all elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
