package Loops;
/*
Program to display AP 2, 5, 8, 11... upto n terms
 */

import java.util.Scanner;

public class DisplayAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter number of terms: ");
        int n = sc.nextInt();
        IO.println("Following is the required AP: ");
        for (int i = 2; i < 3*n - 1;/*
        since nth term of AP is a+(n-1)d
         as a = 2 and d = 3, = 2+(n-1)3
                             = 2+3n-3
                             = 3n-1*/ i+=3) {
            IO.print(i+" ");
        }
    }
}
