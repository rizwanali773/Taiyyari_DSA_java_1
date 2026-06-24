package If_Else;

import java.util.Scanner;

public class Divisibleby5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num < 0) num = -num;
        if (num % 5 == 0) System.out.println(num + " is divisible by 5");
        else System.out.println(num + " is not divisible by 5");
    }
}
