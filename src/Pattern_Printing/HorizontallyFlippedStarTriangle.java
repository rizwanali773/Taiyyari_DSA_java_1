package Pattern_Printing;

import java.util.Scanner;

public class HorizontallyFlippedStarTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

// Another approach using another variable (a)
/*
public class HorizontallyFlippedStarTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(" * ");
            }
            a--;
            System.out.println();
        }
    }
}

 */
