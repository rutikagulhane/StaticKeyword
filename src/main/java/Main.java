public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(StaticExample.no);

        StaticExample.printName("ABC");
        StaticExample ex=new StaticExample();
        ex.nonStaticMethod("DEF");

        StaticExample obj1=new StaticExample();
        StaticExample obj2=new StaticExample();
        obj1.no=25;
        obj1.no1=20;

        obj2.no=30;
        obj2.no1=35;
        System.out.println("Obj1 Static variable : "+obj1.no);
        System.out.println("Obj1 Instance variable : "+obj1.no1);
        System.out.println("Obj2 Static variable : "+obj2.no);
        System.out.println("Obj2 Instance  variable : "+obj2.no1);



    }

}
