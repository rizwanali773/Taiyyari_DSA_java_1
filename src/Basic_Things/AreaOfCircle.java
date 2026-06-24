package Basic_Things;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
//        Input lene ke liye
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}
