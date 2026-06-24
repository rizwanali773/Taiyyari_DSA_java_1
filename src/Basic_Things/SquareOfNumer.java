package Basic_Things;

import java.util.Scanner;

public class SquareOfNumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double num = sc.nextDouble();
        double sq = num * num;
        System.out.print("Square is: " + sq);

    }
}
