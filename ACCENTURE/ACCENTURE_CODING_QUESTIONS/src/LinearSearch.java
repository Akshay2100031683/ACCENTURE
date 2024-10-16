package src;

import java.util.Scanner;

public class LinearSearch {

    public static int LinSch(int arr[], int item, int n) {

        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = arr.length();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int item = sc.nextInt();

        int result = LinSch(arr, item, n);

        if (result == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Item found at index: " + result);
        }

        sc.close(); // Close the scanner
    }
}
