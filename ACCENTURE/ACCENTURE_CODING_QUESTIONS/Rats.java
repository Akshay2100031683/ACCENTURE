package ACCENTURE_CODING_QUESTIONS;

import java.util.Scanner;

public class Rats {
    public static int minimum(int r, int unit, int[] arr) {
        if (arr == null) {
            return -1;
        }

        int foodReq = r * unit; // Calculate the total food required
        int foodAaai = 0; // Initialize the total food available

        // Calculate the total food available from all houses
        for (int i = 0; i < arr.length; i++) {
            foodAaai += arr[i];
        }

        // If the total food available is less than required, return 0
        if (foodAaai < foodReq) {
            return 0;
        }

        int houseCount = 0; // Initialize the house count
        int FoodColl = 0; // Initialize the food collected so far

        // Iterate through the array to find the minimum number of houses needed
        for (int i = 0; i < arr.length; i++) {
            int food = arr[i]; // Get the amount of food in the current house
            FoodColl += food; // Add the current house's food to the total food collected
            houseCount++; // Increase the house count by 1

            // Check if we have collected enough food
            if (FoodColl >= foodReq) {
                return houseCount; // Return the number of houses needed
            }
        }

        return houseCount; // This line should ideally never be reached
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rats (r): ");
        int r = scanner.nextInt();

        System.out.print("Enter the amount of food each rat consumes (unit): ");
        int unit = scanner.nextInt();

        System.out.print("Enter the number of houses (n): ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the amount of food in each house:");

        // Correct input loop
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = minimum(r, unit, arr);
        System.out.println("Minimum number of houses required: " + result);

        scanner.close();
    }
}
