package Arrays;


import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40}; // 16 byte || 1 int - 4 byte
//        int[] x = arr; // x is a shallow copy of arr
//        x[0] = 100;
        // making a deep copy of arr
//        int[] y = Arrays.copyOf(arr, arr.length);
        // deep copy banane ka dusra tareeka
        int[] y = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            y[i] = arr[i];
        }
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
