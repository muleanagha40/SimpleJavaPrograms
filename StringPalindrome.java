import java.util.*; 
class StringPalindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
	    String s = sc.next();
		int j=5;
		for(int i=0;i<=s.length();i++){
			if(s.indexof(i) == s.indexof(s.length())){
				j++;
				continue;
			}
			else 
				break;
		}
		  if(j==5){
			System.out.println("Not Palindrome");
		 }
		 else 
			System.out.println("Palindrome");
	     
	     
	}
}