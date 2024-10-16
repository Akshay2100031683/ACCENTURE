import java.util.Scanner;

public class largest {
    public static int getLarge(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) { // Changed condition to i < n
            if (arr[i] > max) { // Find the largest element, so we check arr[i] > max
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nLargest element is: " + getLarge(arr, n));

        sc.close();
    }
}
