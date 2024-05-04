import java.util.*;
class Simple{
	float p , a ,i ;
	double r;  
  void interest(float a, float p){
    i = a - p;
	System.out.println("Simple Interest is "+i);
  }  
}
class Simple1 extends Simple {
	Simple s = new Simple();
	float p , a ;
	double r;
    float i1 = s.i;
  Scanner sc = new Scanner(System.in);
  void interest(float a ,float p ){
    System.out.print("Enter time :");
	int t = sc.nextInt();
	r = (double)(a-p);
	double r1 = r / (double)p;
	double r2 = r1/(double)t;
	System.out.println("Rate is "+r2);
   }
   public static void main(String ars[]){
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter principal and amount :");
	 float p = sc.nextFloat();
	 float a = sc.nextFloat();
	 Simple s1 = new Simple1();
	 Simple s2 = new Simple();
	 s1.interest(a , p);
	 s2.interest(a , p);
   } 
 }
 