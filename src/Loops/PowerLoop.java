package Loops;

import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        int power = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = sc.nextInt();
        System.out.print("Enter an exponent: ");
        int exp = sc.nextInt();
        for (int i = 0; i < exp; i++){
            power *= base;
        }
        System.out.println(base + " raise to the power of " + exp + "is: " + power);
    }
}
