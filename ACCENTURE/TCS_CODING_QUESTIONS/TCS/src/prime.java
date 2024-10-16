import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;

            }
        }

        if (isPrime && n > 1) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }
}
