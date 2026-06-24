package Loops;
/*
Display this GP - 1, 2, 4, 8... upto n terms
 */

import java.util.Scanner;

public class DisplayGP {
    public static void main(String[] args) {
        int a = 1, r = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            a *= r;
        }
    }
}
