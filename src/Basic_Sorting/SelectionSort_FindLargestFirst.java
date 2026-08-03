package Basic_Sorting;

import java.util.Scanner;

public class SelectionSort_FindLargestFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Sorted Array: ");
        reverse_selection_sort(arr);
        print(arr);
    }

    public static void reverse_selection_sort(int[] arr){
        int n = arr.length;

        // Algorithm
        for (int i = n - 1; i >= 0; i--) {
            // 1. Selecting the maximum element in unsorted part of array
            int max = Integer.MIN_VALUE;
            int maxdx = -1; //index of maximum element
            for (int j = 0; j < i + 1; j++) {
                if (arr[j] > max){
                    max = arr[j];
                    maxdx = j;
                }
            }
            // 2. Swapping the first with minimum element of unsorted part of array
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
