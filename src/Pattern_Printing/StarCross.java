package Pattern_Printing;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "Input should be odd";
        if (n % 2 == 0)
            System.out.println(s);
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j ||  i == n - j + 1)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
                System.out.println();
            }
        }
    }
}
