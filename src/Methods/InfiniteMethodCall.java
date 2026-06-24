package Methods;

public class InfiniteMethodCall {
    public static void main(String[] args) {
        rishika();
    }
    public static void rishika(){
        System.out.println("archit");
        ishan();
    }
    public static void ishan(){
        System.out.println("lakshay");
        malini();
    }
    public static void malini(){
        System.out.println("malini");
        rishika();
    }
}
