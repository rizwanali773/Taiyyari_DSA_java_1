package Loops;
/*
Program to print AP - 99, 95, 91, 87,... upto all terms which
are > 0
 */

public class DisplayAP3 {
    public static void main(String[] args) {
        int a = 99;
        int d = -4;
        for (int i = 0; a > 0; i++) {
            System.out.print(a+" ");
            a += d;
        }
    }
}
