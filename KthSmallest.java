import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = { 7, 4, 9, 2, 6 };

        Arrays.sort(arr);

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (k > 0 && k <= arr.length)
            System.out.println("Kth Smallest = " + arr[k - 1]);
        else
            System.out.println("Invalid K");
    }
}
