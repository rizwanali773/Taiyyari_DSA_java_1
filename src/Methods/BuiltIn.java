package Methods;

public class BuiltIn {
    public static void main(String[] args) {
        // Math wale
        System.out.println(Math.sqrt(100));
        System.out.println(Math.cbrt(100));
        System.out.println(Math.PI); // not a method
        System.out.println(Math.abs(-45));
        System.out.println(Math.floor(-7.8));
        System.out.println(Math.ceil(5.0001));
        System.out.println(Math.min(4, 7));
        System.out.println(Math.max(8, 5));
        System.out.println(Math.pow(5, 3)); // print NaN (Not a Number) if a < 0 && b < 0 and b is having a fractional part
    }
}
