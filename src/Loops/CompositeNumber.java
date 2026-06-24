package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 2; i < n/* i <=  Math.sqrt(n)*/; i++) {
            //Time complexity optimise karne ke liye 2nd condition
            //use hoga
            if (n % i == 0) {
                System.out.println("Composite Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
/*
Alternate approach

pub class CompositeNumer{
    psvma{
       int n = input something;
       int x = 0 // 0 means prime
       for (int i = 2; i < n; i++){
           if(n % i == 0){
               x = 1 // 1 means composite number
               break;
           }
       }
       if (x == 0) sout(Prime)
       else sout(composite)
   }
}
 */