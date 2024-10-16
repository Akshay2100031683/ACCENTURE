import java.util.Scanner;

public class Pal {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String input = sc.nextLine();
        String reverswString = new StringBuilder(input).reverse().toString();
        if (input.equals(reverswString)) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
        sc.close();

    }
}
