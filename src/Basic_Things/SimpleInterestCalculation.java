package Basic_Things;

import java.util.Scanner;

public class SimpleInterestCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        float rate = sc.nextFloat();
        System.out.print("Enter Time (in years): ");
        int time = sc.nextInt();

        double SI = principal * rate * time / 100;

        System.out.println("Simple Interest is: " + SI);
    }
}
