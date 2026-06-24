package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num == 0) count++;
        while (num != 0){
            num /= 10;
            count++;
        }
        System.out.println("No. of digits: " + count);
    }
}
