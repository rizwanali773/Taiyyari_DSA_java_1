package Arrays;

import java.util.Scanner;

public class Merge2SortedArrays {
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

        int[] c = new int[a.length + b.length];
        merge(a, b, c);

        System.out.print("Merged Sorted Array: ");
        for (int el : c){
            System.out.print(el+" ");
        }
        System.out.println();
    }

    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                c[k++] = a[i++];
                /*
                c[k]=a[i]
                i++
                k++
                 */
            } else {
                c[k++] = b[j++];
                /*
                c[k]=b[j]
                j++
                k++
                 */
            }
        }
        if(i == a.length){ // a array khatam -> take remaining elements of b
            while (j < b.length){ // not necessary to write under if block but only for robustness
                c[k++] = b[j++];
            }
        }
        if(j == b.length){ // b array khatam -> take remaining elements of a
            while (i < a.length){ // not necessary to write under if block but only for robustness
                c[k++] = a[i++];
            }
        }
    }
}
