package Arrays;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array (0 - 9): ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        print(arr);

        Vector<Integer> added = addOne(arr);
        System.out.print("Array after addition: ");
        System.out.println(added);
    }

    public static Vector<Integer> addOne(int[] arr){
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            if(arr[i] + carry <= 9){
                ans.add(arr[i] + carry);
                carry = 0;
            } else { // arr[i] + carry = 10
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }

    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }
}
