package Basic_Sorting;

import java.util.Scanner;

public class InsertionSort {
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
        insertion_sort(arr);
        print(arr);
    }

    public static void insertion_sort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
