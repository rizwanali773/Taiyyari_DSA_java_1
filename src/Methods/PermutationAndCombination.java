package Methods;
// Take n and r as input and print nCr and nPr

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nCr = facto(n) / (facto(r) * facto(n - r));
        int nPr = facto(n) / facto(n - r);

        System.out.println("Combination : "+nCr);
        System.out.println("Permutation : "+nPr);

    }

    public static int facto(int x){
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}
