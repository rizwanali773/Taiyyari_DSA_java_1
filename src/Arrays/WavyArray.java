package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WavyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Original Array: ");
        print(arr);
        wavy(arr);
        System.out.print("Wavy Array: ");
        print(arr);
    }

    public static void print(int[] arr){
        for (int el : arr)
            System.out.print(el+" ");
        System.out.println();
    }

    public static void wavy(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i += 2) {

            /*
            if (i == arr.length - 1)
                break;
            else{
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
             */

            // I would be hitting ith iteration is last or not.
            // Following approach is better that we should be iterating loop from start index of array upto the second last index,
            // instead of iteration over full array index.

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
