package If_Else;

import java.util.Scanner;

public class TernaryInVariable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int prasun = (n > 0) ? 100 : 0;
    }
}
