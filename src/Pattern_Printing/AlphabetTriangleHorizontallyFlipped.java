package Pattern_Printing;

import java.util.Scanner;

public class AlphabetTriangleHorizontallyFlipped {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(" "+(char)(j + 96)+" ");
            }
            System.out.println();
        }
    }
}
