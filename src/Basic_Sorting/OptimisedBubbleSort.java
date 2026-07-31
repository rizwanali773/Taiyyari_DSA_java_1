package Basic_Sorting;

//Before each pass we should actually be checking whether array is sorted or not
//If array is sorted then break or else sort the array....

import java.util.Scanner;

public class OptimisedBubbleSort {
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
        bubble_sort(arr);
        print(arr);
    }

    public static void bubble_sort(int[] arr){
        int n = arr.length - 1;
        for (int i = 0; i < n; i++){
            boolean isSorted = true;
            for (int j = 0; j < n; j++){
                if(arr[j] > arr[j + 1]){
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) break;
            for (int k = 0; k < n - i; k++){
                if(arr[k] > arr[k + 1]){
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }

            /*
            // Another way
            int swaps = 0;
            for (int i = 0; i < n; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) break;
             */
        }
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
