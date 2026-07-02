package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        print(arr);
        reverse(arr);
        System.out.print("Reversed Array: ");
        print(arr);
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i < j){
            int temp;

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    /*
    - Suggested by Shreya

    public static void reverse(int[] arr){
        int i = 0, n = arr.length;
        for (i = 0; i < n / 2; i++){
            int temp;

            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;

        }
    }
     */

    
    /*
    - Method for reversing elements within the array

    public static void reverseWithinIndex(int[] arr, int first, int last){
        int i = first, j = last;
        while (i < j){
            int temp;

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
     */

}
