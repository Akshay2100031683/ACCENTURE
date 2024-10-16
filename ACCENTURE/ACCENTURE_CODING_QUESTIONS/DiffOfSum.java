package ACCENTURE_CODING_QUESTIONS;

import java.util.Scanner;

public class DiffOfSum {

    public static int differenceofSum(int n, int m) {
        if (m < 0 && n < 0) {
            return 0;
        }
        int evencount = 0;
        int oddcount = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                evencount += i;
            } else {
                oddcount += i;
            }

        }
        return (oddcount) - (evencount);

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.println("Difference of sum is: " + differenceofSum(n, m));
        scanner.close();
    }

}
