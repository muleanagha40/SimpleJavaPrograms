import java.util.*;
public class Vec {

	public static void main(String[] args){
		Vector list = new Vector();
		int length = args.length;
		  for(int i=0;i<length;i++) {
			  list.addElement(args[i]);
		  }
		  list.insertElementAt("Cobol",2);
		  int size = list.size();
		  String listArray[]= new String[size];
		  list.copyInto(listArray);
		  System.out.println("List of languages");
	