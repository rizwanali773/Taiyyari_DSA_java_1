package Basic_Things;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double v = 3.141592 * (4 / 3) * r * r * r;
        System.out.print("Volume is: ");
        System.out.println(v);
    }
}
