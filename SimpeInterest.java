import java.util.*;
public class SimpleInterest {
     float a, p,r, i;
     int t;
     void simple(float a, float p) {
    	 i = a-p;
    	 System.out.println("Simple Interest is :"+i);
     }
}
    class Interest extends SimpleInterest { 
    	Scanner sc = new Scanner(System.in);
    	void simple(float a , float p) {
			SimpleInterest r = new SimpleInterest();
    		System.out.print("Enter time : ");
    		int t = sc.nextInt();
    		float r = (100*r.i)/(p*t);
    		System.out.println("Rate is :"+r);
    	}
	  public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
        		System.out.println("Enter Principal and Amount :");
        		float p = sc.nextFloat(); 
        		float a = sc.nextFloat();
        		SimpleInterest s = new Interest();
        	    SimpleInterest i = new SimpleInterest();
        	    i.simple(a, p);
        	    s.simple(a, p);

	}

}
