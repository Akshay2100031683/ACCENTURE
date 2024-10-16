package ACCENTURE_CODING_QUESTIONS;

import java.util.Scanner;

public class operations {
    public static int OperationsBinaryString(String str) {
        if (str == null) {
            return -1;
        }
        int res = str.charAt(0) - '0';
        for (int i = 1; i < str.length();) {
            char prev = str.charAt(i);
            i++;
            if (prev == 'A') {
                res = res & (str.charAt(i) - '0');
            } else if (prev == 'B') {
                res = res | (str.charAt(i) - '0');

            } else {
                res = res ^ (str.charAt(i) - '0');

            }
            i++;
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the string: ");
        String str = sc.next();
        System.out.println(OperationsBinaryString(str));
        sc.close();

    }

}
