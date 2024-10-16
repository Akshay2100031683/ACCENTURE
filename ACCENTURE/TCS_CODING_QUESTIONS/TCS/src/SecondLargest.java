import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static int getSecl(int arr[], int n) {
        if (n < 2) {
            return 0;
        }
        for (int i = 0; i <= n; i++) {
            Arrays.sort(arr);
        }
        return arr[n - 2];

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSecl(arr, n);
        if (result != 0) {
            System.out.println("Second largest element is " + result);
        }

        sc.close();

    }

}
