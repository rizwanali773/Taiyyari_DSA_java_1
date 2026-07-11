package Arrays;

import java.util.Scanner;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements of array (0s and 1s only): ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array: ");
        print(arr);
        segregate0and1(arr);
        System.out.print("Segregated Array: ");
        print(arr);
    }

    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
        System.out.println();
    }

    // This is a two pass solution
    public static void segregate0and1(int[] arr){
        int numberOfZeros = 0;
        int numberOfOnes = 0; // not necessary although

        for (int el : arr){
            if (el == 0)
                numberOfZeros += 1;
            else
                numberOfOnes += 1;
        }

        int n = numberOfOnes + numberOfZeros; // not really needed

        for (int i = 0; i < numberOfZeros; i++)
            arr[i] = 0;
        for (int i = numberOfZeros; i < n /* OR i < arr.lemgth */; i++)
            arr[i] = 1;

    }

    // Below is the two pointer approach
    /*
    public static void segregate0and1(int[] arr){
        int n = arr.length;

        int i = 0, j = n - 1;

        while(i < j){
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;

            // if (i > j) break; // It is for the robustness of the program
            // Warna else if ladder me upar wale line ka bhi zarurat nahi padega

            else if (arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
     */
}
