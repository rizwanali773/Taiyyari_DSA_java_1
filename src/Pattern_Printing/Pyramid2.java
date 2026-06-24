package Pattern_Printing;

import java.util.Scanner;

/*
Method - 2
- Maths nahi lagegi
- nsp - nst method
- nsp = no. of spaces
- nst = no. of stars
- Har lines me kuch stars or kuch spaces print hote hain
- Har line me 2 loops chalegi
- nsp lo n - 1 se initialize karo
- nst ko 1 se initialize karo
- Jaise hi ek line print hui
    - nsp--
    - nst += 2
 */
public class Pyramid2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;

//      Multiple loops in a loop
        for (int i = 1; i <= n; i++) {

//          To print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("   ");
            }

//          no. of spaces reduced by 1
            nsp--;

//          To print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print(" * ");
            }

//          no. of stars increased by 2
            nst += 2;

//          For printing a new line
            System.out.println();

        }

    }

}
