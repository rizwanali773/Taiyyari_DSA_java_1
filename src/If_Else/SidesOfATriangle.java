package If_Else;

import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of side 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter value of side 'b': ");
        int b = sc.nextInt();
        System.out.print("Enter value of side 'c': ");
        int c = sc.nextInt();
        if ((a + b > c) || (b + c > a) || (c + a > b))
            System.out.println("The Triangle exist");
        else
            System.out.println("Triangle does not exist");
    }
}
