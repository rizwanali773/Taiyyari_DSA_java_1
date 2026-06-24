package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double abs;
        if (num < 0) abs = -num;
        else abs = num;
        System.out.println("Absolute value of "+ num +" is "+ abs);
    }
}
