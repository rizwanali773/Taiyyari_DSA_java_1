package If_Else;

import java.util.Scanner;

public class IsInteger {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number: ");
        double num = sc.nextDouble();
        int x = (int)num;
        if (num - x > 0) System.out.println(num+" is not an integer");
        else System.out.println(x+" is an integer");
    }
}
