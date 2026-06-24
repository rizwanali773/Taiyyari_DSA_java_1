package Pattern_Printing;

import java.util.Scanner;

public class Pattern7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(" "+(char)(i + 64)+" ");
            }
            a--;
            System.out.println();
        }
    }
}
