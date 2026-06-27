package Arrays;

public class ArrayOfOtherDatatypes {
    public static void main(String[] args) {
        /*
        char[] arr = new char[8];
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i]+" ");
         */
        String[] arr = {"Abhinav","Harsh","Achyutam","Sahil","Isha"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1)+". "+arr[i]);
        }
    }
}
