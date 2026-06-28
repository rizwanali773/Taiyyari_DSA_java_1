package Arrays;

import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate max
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max1)
                max1 = arr[i];
        }
        //Calculating second max
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max2 && arr[i] != max1)
                max2 = arr[i];
        }
        System.out.println("Second Max: "+max2);
    }
}
