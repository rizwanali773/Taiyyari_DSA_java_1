package Basic_Sorting;

import java.util.Scanner;

public class ReverseBubbleSort {
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
        reverse_bubble_sort(arr);
        print(arr);
    }

    public static void reverse_bubble_sort(int[] arr){
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            int swaps = 0;
            for (int j = 0; j < n /*or (n -i) isse no. operations kam honge*/; j++) {
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
        }
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }

}
