public class Small {
    public static int getMin(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], getMin(arr, n - 1));

    }

    public static void main(String args[]) {
        int arr[] = { 5, 2, 8, 1, 9, 3, 4 };
        int n = arr.length;
        System.out.println("Minimum element is " + getMin(arr, n));
    }
}
