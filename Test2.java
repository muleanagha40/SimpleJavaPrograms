public final class Test2 {
  final void display(){
    System.out.println("Final class final method");	
   }
   }
 class Test1 extends Test2{ 
   public static void main(String args[]){
     Test2 t = new Test2();
     t.display();
     System.out.println("We are in Derived class");	 
    }
 }
