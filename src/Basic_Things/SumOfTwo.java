package Basic_Things;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        double sum = x + y + z;

        System.out.println("Sum is: " + sum);
    }
}
