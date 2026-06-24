package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        float cp = sc.nextFloat();
        System.out.print("Enter Selling Price: ");
        float sp = sc.nextFloat();
        if (sp > cp) System.out.println("Profit: "+ (sp - cp));
        else if (cp > sp) System.out.println("Loss: "+ (cp - sp));
        else System.out.println("Neither profit nor loss");
    }
}
