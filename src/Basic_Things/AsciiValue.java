package Basic_Things;

public class AsciiValue {
    public static void main(String[] args) {
//        typecasting - ek datatype se dusre dataype me conversion
        char ch = 'A';
        int x = ch;
        System.out.println(x);

        char piyush = 'a';
        int y = (int) piyush;  // explicit typecasting
        System.out.println(y);

        char harsh = '3';
        System.out.println((int) harsh);

        char chr = 'c';
        System.out.println(chr+1);
        System.out.println(chr*chr);

        char character = 'y';
        System.out.println(character+0);

//        integer to character
        int z = 43;
        char c = (char) x;
        System.out.println(c);
    }
}
