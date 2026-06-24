package Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//      To print upper path
        for (int i = 1; i < 2 * n; i++) {
            System.out.print(" * ");
        }
        System.out.println();

        int nsp = 1;
        int nst = n - 1;

//      Multiple loops in a loop
        for (int i = 1; i <= n - 1; i++) {

//          To print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }

//          To print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

//          To print stars again
            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }

            nst--;
            nsp += 2;

//          For printing a new line
            System.out.println();

        }
    }
}
