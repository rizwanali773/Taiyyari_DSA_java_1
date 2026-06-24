package Pattern_Printing;

import java.util.Scanner;

public class HorizontallyAndVerticallyFlippedStarTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//      Multiple loops in a loop
        for (int i = 1; i <= n; i++) {

//          To print spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }

//          To print stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" * ");
            }

//          For printing a new line
            System.out.println();

        }

    }
}
