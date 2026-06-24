package Loops;
// continue statement will be used
public class EvenUptoHundred2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            if (i % 2 != 0)
                continue;
            System.out.println(i + " ");
        }
    }
}
