package Loops;

import java.util.Scanner;

public class DisplayAP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term of AP: ");
        int a = sc.nextInt();
        System.out.print("Enter common difference: ");
        int d = sc.nextInt();
        System.out.print("Enter no. of terms: ");
        int n = sc.nextInt();
        System.out.println("Following is the required AP: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            a += d;
        }
    }
}
