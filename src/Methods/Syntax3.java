package Methods;
// H.W. :- What will be the output of following code
public class Syntax3 {
    public static void shravan(){
        karan();
        System.out.println("Khushi");
    }
    public static void main(String[] args) {
        riyanshi();
    }
    public static void karan(){
        System.out.println("YASHIKA");
    }
    public static void riyanshi(){
        karan();
        shravan();
        System.out.println("Ajay");
        shravan();
    }
}
