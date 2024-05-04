import java.io.*;
import java.util.*;
class Scan2{
	public static void main(String args[])throws IOException{
		InputStreamReader r = new InputStreamReader(System.in);    
        BufferedReader br = new BufferedReader(r);            
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter values \nbyte,short,int,long,float,double,boolean,character,string:");
		//byte b = Byte.parseByte(br.readline());
		//short s =Short.parseShort(br.readline());
		//int i = Integer.parseInt(br.readline());
		//long l = Long.parseLong(br.readline());
		//float f = Float.parseFloat(br.readline());
		//double d = Double.parseDouble(br.readline());
		//boolean b = Boolean.parseBoolean(br.readline());
		//char ch = (char)br.read();
		String g = br.read();
		//System.out.println("byte\tshort\tint\tlong\t\tfloat\tdouble\tboolean\tchar\tstring");
		//System.out.println("***************************************************************");
		//System.out.println(b+s+i+l+f+d+b+ch+g);
		System.out.println(g);
	}
}