package Basic_Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOf2Arrays {
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
        al = union_of_2_sorted_arrays(a, b);

        System.out.print("Union Of Array: ");
        System.out.println(al);
    }

    public static ArrayList<Integer> union_of_2_sorted_arrays(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                addIfNotDuplicate(al, a[i]);
                i++;
            } else {
                addIfNotDuplicate(al, b[j]);
                j++;
            }
        }

        while (i < a.length) {
            addIfNotDuplicate(al, a[i]);
            i++;
        }

        while (j < b.length) {
            addIfNotDuplicate(al, b[j]);
            j++;
        }

        return al;
    }

    private static void addIfNotDuplicate(ArrayList<Integer> al, int val) {
        if (al.isEmpty() || al.get(al.size() - 1) != val) {
            al.add(val);
        }
    }


}
