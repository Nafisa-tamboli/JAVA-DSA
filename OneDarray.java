import java.util.Scanner;

public class OneDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare and initialize a 1D array
        int[] arr = new int[5];

        // Input elements
        System.out.println("Enter 5 elements for the 1D array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print elements
        System.out.println("Elements in the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Find sum of elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("\nSum of elements: " + sum);
    }
}
