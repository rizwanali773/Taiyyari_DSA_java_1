package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int sumOfDigits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) num = -num;
        while (num != 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }
        System.out.println("Sum Of Digits: " + sumOfDigits);
    }
}
