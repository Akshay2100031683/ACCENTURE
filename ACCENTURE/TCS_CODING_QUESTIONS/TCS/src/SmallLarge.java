import java.util.Arrays;
import java.util.Scanner;

public class SmallLarge {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int n = sc.nextInt();
        System.out.println("enter the array od size n");
        int[] arr = new int[6];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);
        int secondLargest = arr[n - 2];
        int secondSmallest = arr[1];
        System.out.println("second largest number is " + secondLargest);
        System.out.println("Smallest number is" + secondSmallest);
        sc.close();

    }
}
