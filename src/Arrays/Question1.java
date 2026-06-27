package Arrays;

import java.util.Scanner;

/*
Multiply odd indexed elements by 2 and
add 10 to even indexed elements
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        modify(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void modify(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0){
                arr[i] *= 2;
            } else {
                arr[i] += 10;
            }
        }
    }
}
