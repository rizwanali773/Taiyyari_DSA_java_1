package If_Else;

import java.util.Scanner;

public class Divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 3 == 0){
            System.out.println("Apoorva");
        } else if (num % 5 == 0) {
            System.out.println("Riya");
        } else if (num % 3 == 0) {
            System.out.println("Banu");
        } else {
            System.out.println("Isha");
        }
    }
}

/*
 The above program can also be executed as follows:

 package If_Else;

 import java.util.Scanner;

 public class Divisibleby5and3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number: ");
         int num = sc.nextInt();
         if (num % 5 == 0 && num % 3 == 0){
             System.out.println("Apoorva");
         } else if (num % 5 != 0 && num % 3 != 0) {
             System.out.println("Isha");
         } else if (num % 5 == 0) {
             System.out.println("Riya");
         } else {
             System.out.println("Banu");
         }
     }
 }
*/

