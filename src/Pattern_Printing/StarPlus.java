package Pattern_Printing;

import java.util.Scanner;

public class StarPlus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Input should be odd.");
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == (n / 2) + 1 || i == (n / 2) + 1)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
                System.out.println();
            }
        }
    }
}
