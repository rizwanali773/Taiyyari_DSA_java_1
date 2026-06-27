package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {10, 3, 29, 38};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        y[2] = 99;
    }
    /*
    Conclusion:
    Whenever we pass an array to methods, the array is passed
    by reference(not by value - as in case of variables).
    Yani ki agar ham array ko bhej rahe hain kisi or
    reference variable mein to dhyan rakhna hoga, kyuki
    uske sath chhed chhad ho sakti hai.
     */
}
