import java.io.*;
class Primes{
   static boolean prime(lomg num){
     boolean isPrime = true;
	 for (int i = 2; i<=num ; i++)
	  if(num%2 == 0)isPrime= false;
	 return isPrime;
	}
	static void generate(long max){
	 long c =1; num=2;
	  while(c<=max){
	   if(isPrime(num)){
	    System.out.println(num);
		++c;
	    }
		++num;
	  }
	 }
 }
 class PrimeDemo{
   public static void main(String args[]){
	long num=2;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("How many prime ?");
	int max = Integer.parseInt(br.readLine());
	Primes.generate(max);
    }
  }