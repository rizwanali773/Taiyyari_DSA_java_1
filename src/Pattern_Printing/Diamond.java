package Pattern_Printing;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//      For upper half
        int nsp = n - 1;
        int nst = 1;

//      Multiple loops in a loop
        for (int i = 1; i <= n; i++) {

//          To print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

//          no. of spaces reduced by 1
            nsp--;

//          To print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }

//          no. of stars increased by 2
            nst += 2;

//          For printing a new line
            System.out.println();

        }

//      For lower half
        nsp = 1;
        nst = 2 * n - 3;

//      Multiple loops in a loop
        for (int i = 1; i <= n - 1; i++) {

//          To print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

//          no. of spaces increased by 1
            nsp++;

//          To print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }

//          no. of stars reduced by 2
            nst -= 2;

//          For printing a new line
            System.out.println();

        }

    }

}