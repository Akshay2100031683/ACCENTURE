import java.util.Scanner;

public class Fibb {
    public static void main(String args[]) {
        int n, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(a + " ");

            a = b;
            b = c;
            c = a + b;
        }
        sc.close();

    }
}
