package If_Else;

import java.util.Scanner;

public class OddEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numer: ");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
    }
}
