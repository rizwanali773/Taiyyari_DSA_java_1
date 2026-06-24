package Loops;
/*
Program to print 'Yashika' n times, taking 'n' as input from user
 */

import java.util.Scanner;

public class Yashika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n+" times Yashika printed:");
        for (int i = 0; i < n; i++) {
            IO.println("Yashika");
        }
    }
}
