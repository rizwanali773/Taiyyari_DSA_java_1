package Loops;

public class OddsDivisibleby3 {
    public static void main(String[] args) {
        IO.println("Following are the odd numbers divisible by 3 (upto 100):");
        for (int i = 1; i <= 99; i+=2)
            if (i % 3 == 0)
                IO.println(i);
    }
}
