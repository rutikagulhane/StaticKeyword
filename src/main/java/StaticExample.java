public  class StaticExample {
   static int no=12;
   int no1=15;

      static void printName(String name)
      {
         System.out.println(name);

      }
   public void nonStaticMethod(String name)
   {
      printName(name);
      System.out.println(no);
   }
}
