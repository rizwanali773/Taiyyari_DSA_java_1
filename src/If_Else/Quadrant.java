/*
Given a point (x, y), write a program to find out if it lies in
1st Quadrant, 2nd Quadrant, 3rd Quadrant, 4th Quadrant, on the
x-axis, y-axis or at the origin.
*/


package If_Else;

import java.util.Scanner;

public class Quadrant {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.print("Location of point is: ");
        if (x > 0 && y > 0)
            System.out.println("1st Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("2nd Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("3rd Quadrant");
        else if (x > 0 && y < 0)
            System.out.println("4th Quadrant");
        else if (x == 0 && y != 0)
            System.out.println("Y-axis");
        else if (x != 0)
            System.out.println("X-axis");
        else
            System.out.println("Origin");
    }
}
