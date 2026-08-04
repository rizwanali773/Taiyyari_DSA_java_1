package Basic_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum2Pointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target integer: ");
        int target = sc.nextInt();

        System.out.print("Two Sum: ");
        twoSum(arr, target);

    }

    public static void twoSum(int[] arr, int target){
        Arrays.sort(arr);

        boolean notFound = true;
        int i = 0, j = arr.length - 1;
        while(i < j){
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + " " + arr[j]);
                notFound = false;
                break;
            }
            else if (arr[i] + arr[j] > target)
                j--;
            else
                i++;
        }
        if (notFound){
            System.out.println("Not Found");
        }

    }
}
