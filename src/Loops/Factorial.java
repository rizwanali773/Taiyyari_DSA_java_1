package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        switch (num) {
            case 0, 1 -> {
            }
            default -> {
                for (int i = 2; i <= num; i++)
                    factorial *= i;
            }
        }
        System.out.println("Factorial: " + factorial);
    }
}
