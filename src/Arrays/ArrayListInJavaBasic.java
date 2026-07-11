package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(24);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        System.out.println(arr.get(2)); //arr[2]
        arr.set(3, 50); // arr[3] = 50

        System.out.println(arr); // Prints whole array
        int n = arr.size(); // arr.length
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
        // 23, 24, 18, 50, 10
        arr.add(78); // 23, 24, 18, 50, 10, 78
        arr.add(1, 100);
        System.out.println(arr);
        arr.remove(arr.size() - 1);
        System.out.println(arr);

        // Collections.reverse(arr);
        int i = 0, j = arr.size() - 1;
        while (i < j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
