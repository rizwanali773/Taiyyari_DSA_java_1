package Pattern_Printing;

import java.util.Scanner;

public class StarTriangleVerticallyFlippedMethod2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//      Multiple loops inside a loop
        for (int i = 1; i <= n; i++) {

//          to print spaces
            for (int j = 1; j <= n - i ; j++) {
                System.out.print("   ");
            }

//          to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

//          for printing a new line
            System.out.println();
        }

    }
}
