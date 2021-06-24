public class StaticBlockExample {
    static int number;

    static{
        System.out.println("static block 1 called");
        number=100;
    }
    static{
        System.out.println("static block 2 called");
        number=200;
    }

    public static void main(String[] args) {
        System.out.println("Value of number "+number);
    }
}
