package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 6, 9};
//        for (int el: arr){
//            System.out.print(el+" ");
//        } - only for traversal
        // modification is not done in For Each Loop
        for (int el : arr){
            el *= 2;
        }
        for (int el : arr){
            System.out.print(el+" ");
            //returns same array - no modification
        }
    }
}
