public class StaticNestedClassExample {

    static class NestedClass{
        //non static class
    public  void print()
    {
        System.out.println("inside the nested class");
    }
    }

    public static void main(String[] args) {
     StaticNestedClassExample.NestedClass obj=new StaticNestedClassExample.NestedClass();
        obj.print();



    }
}
