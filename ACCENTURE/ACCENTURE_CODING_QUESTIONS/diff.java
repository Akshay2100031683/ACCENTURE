package ACCENTURE_CODING_QUESTIONS;

import java.util.Scanner;

public class diff {
    public static int findCount(int arr[], int length, int num, int diff) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(num - arr[i]) <= diff) {
                count++;
            }

        }

        if (count <= 0) {
            return -1;
        }
        return count;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int num = sc.nextInt();
        int diff = sc.nextInt();

        System.out.println(findCount(arr, n, num, diff));
        sc.close();
    }

}
