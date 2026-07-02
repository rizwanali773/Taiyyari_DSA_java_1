package Arrays;

import java.util.Scanner;

public class RotateArray {
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
        System.out.print("Enter no. of rotations required: ");
        int d = sc.nextInt();
        rotate(arr,d);
        System.out.print("Rotated Array: ");
        print(arr);
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }

    public static void rotate(int[] arr, int d){
        int n = arr.length;
        d %= n;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int i, int j){
        while (i < j){
            int temp;

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
