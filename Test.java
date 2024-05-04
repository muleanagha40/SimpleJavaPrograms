class Test{
  public static void main(String [] a){
   System.out.println("Main method");
   System.out.println(Test.a);
   }
   static{
    System.out.println("Static block");
	System.out.println(Test.a);
   }
   static int a=100;
 }