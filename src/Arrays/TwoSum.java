package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target for Two Sum: ");
        int target = sc.nextInt();

        System.out.println("Finding Two Sum....");
        findTwoSum(target, arr);

    }

    private static void findTwoSum(int target, int[] arr) {
        boolean flag = false;
        int i , j = 0;

        outer:
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target){
                    flag = true;
                    break outer;
                }
            }
        }
        if (flag)
            System.out.println("Two Sum of "+target+" exists at indices: ("+i+", "+j+")");
        else
            System.out.println("Two Sum does not exist");
    }
}
