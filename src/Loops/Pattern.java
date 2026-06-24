package Loops;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(n): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println(i+1);
            System.out.println(n-i);
            //n--;
        }
    }
}

/*
agar ye pateern print karna hai;
1
5
2
4
3
3
[then stop] to uparr ke source code mein commented part ko
uncomment kar do.
 */
