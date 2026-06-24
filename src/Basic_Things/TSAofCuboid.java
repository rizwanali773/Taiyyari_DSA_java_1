package Basic_Things;

import java.util.Scanner;

public class TSAofCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        double tsa = 2*(l*b + b*h + l*h);
        System.out.print("Total Surface Area is: ");
        System.out.println(tsa);
    }
}
