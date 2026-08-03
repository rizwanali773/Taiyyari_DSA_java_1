package Basic_Sorting;

import java.util.Scanner;

public class SelectionSort {
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
        selection_sort(arr);
        print(arr);
    }

    public static void selection_sort(int[] arr){
        int n = arr.length;

        // Algorithm
        for (int i = 0; i < n; i++) {
            // 1. Selecting the minimum element in unsorted part of array
            int min = Integer.MAX_VALUE;
            int mindx = -1; //index of minimum element
            for (int j = i; j < n; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            // 2. Swapping the first with minimum element of unsorted part of array
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
