package Basic_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();

        System.out.print("Enter elements of first array : ");
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of  second array: ");
        int n = sc.nextInt();

        System.out.print("Enter elements of second array : ");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> al = new ArrayList<>();
        al = common_elements(a, b);

        System.out.print("Common Elements: ");
        System.out.println(al);

    }

    public static ArrayList<Integer> common_elements(int[] a, int[] b){
        int n = a.length;
        int m = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> al = new ArrayList<>();

        int i = 0, j = 0;
        while (i < n && j < m){
            if (a[i] == b[j]){
                al.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            }
            else
                j++;
        }

        return al;
    }
}
