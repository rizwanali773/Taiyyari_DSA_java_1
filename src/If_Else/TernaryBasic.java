package If_Else;

import java.util.Scanner;

public class TernaryBasic {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
//        Basic If else for determining odd or even
        /*
        if (n % 2 == 0) sout("even")
        else sout("odd")
         */
//        But the same thing can be executed in a cool way using
//        ternary operator.
//        Ternary Operator Syntax:
//        condition ? sach : jhoot
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
    }
}
