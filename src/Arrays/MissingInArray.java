package Arrays;

import java.util.Scanner;

public class MissingInArray {
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

        int m = missingNumber(arr);
        System.out.print("Missing no. in Array: "+m);
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }

    public static int missingNumber(int[] arr){
        long n = arr.length + 1;
        long sum = n * (n + 1) / 2;
        long arraySum= 0;
        for (int el : arr){
            arraySum+= el;
        }

        return (int) (sum - arraySum);
    }
}
