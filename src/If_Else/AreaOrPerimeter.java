package If_Else;

import java.util.Scanner;

public class AreaOrPerimeter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        int area = length * breadth;
        int perimeter = length + breadth;
        if (area > perimeter)
            System.out.println("Area is greater");
        else if (perimeter > area)
            System.out.println("Perimeter is greater");
        else
            System.out.println("Both area and perimeter are equal");
    }
}
