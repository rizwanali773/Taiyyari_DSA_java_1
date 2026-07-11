package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to find: ");
        int x = sc.nextInt();
        System.out.print("Status: ");
        find(x, arr);
    }

    public static void find(int x, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                System.out.println(x+" is found at index "+i+".");
                return;
            }
        }
        System.out.println(x+" is not found.");
    }

}
