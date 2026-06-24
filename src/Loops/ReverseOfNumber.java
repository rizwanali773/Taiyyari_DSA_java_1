package Loops;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit = 0;
        int reversedNumber = 0;
        while (num != 0) {
            reversedNumber *= 10;
            lastDigit = num % 10;
            num /= 10;
            reversedNumber += lastDigit;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}
