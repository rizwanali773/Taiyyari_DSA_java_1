package Basic_Sorting;

import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int kthSmallest = kth_smallest(arr, k);
        System.out.print("Kth Smallest Element: ");
        System.out.println(kthSmallest);

    }

    public static int kth_smallest(int[] arr, int k){
        int n = arr.length;

        for (int i = 0; i < k; i++){
            int min = Integer.MAX_VALUE, mindx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        return arr[k - 1];
    }
}
