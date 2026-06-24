package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num > 999 && num < 10000) System.out.println(num+" is a 4 digit number");
        else System.out.println(num+" is not a 4 digit number");
    }
}
