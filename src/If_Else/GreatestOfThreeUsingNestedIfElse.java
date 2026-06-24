package If_Else;

import java.util.Scanner;

public class GreatestOfThreeUsingNestedIfElse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter value of 'b': ");
        int b = sc.nextInt();
        System.out.print("Enter value of 'c': ");
        int c = sc.nextInt();
        if (a > b){
            if (a > c)
                System.out.println(a+" is greatest");
            else
                System.out.println(c+" is greatest");
        } else {
            if (b > c)
                System.out.println(b+" is greatest");
            else
                System.out.println(c+" is greatest");
        }
    }
}
