package day23.stringclass;
import java.util.*;
public class Trial {
	public static void main (String[] args)
	{
		String one="radha";
		System.out.println(one);
		for(int i=0;i<one.length();i++) {
			System.out.println(one.charAt(i));
		}
		String rev= "";
		for(int i =one.length()-1;i>=0;i--) {
			rev= rev+one.charAt(i);
		}
		System.out.println(rev);
		
		String ex ="malayalam";
		String rev1= "";
		for(int i =ex.length()-1;i>=0;i--) {
			rev1= rev1+ex.charAt(i);
		}
		System.out.println(rev1);
		if (rev1.equals(ex)) {
			System.out.println("given string is palindrom");
		}
		else{
			System.out.println("given string is not palindrom");
		}
		String original="radha";
		char [] convert = new char [original.length()];
		for(int i=0; i<=original.length()-1;i++) {
			 convert[i]=original.charAt(i);
		}
		System.out.print( convert);
		System.out.println();
		for(int i=convert.length-1;i>=0;i--) {
			System.out.print(convert[i]);
		}	
		System.out.println();
		String s= "keeru";
		char [] con= new char[s.length()];
		for(int i = s.length()-1;i>=0;i--) {
			System.out.print(con [i]=s.charAt(i));
		}
		System.out.println(); 
		String two= "radha dinesh potdar";
		System.out.println(two);
		String two1[]= two.split(" ");
		for(String o:two1) {
		System.out.println(o);
}
		String ulta ="";
		for(int i=two1.length-1;i>=0;i--) {
			ulta = ulta+" "+two1[i];
		}
		System.out.println(ulta);
		
		for(int i=two.length()-1;i>=0;i--) {
			System.out.print(two.charAt(i));
		}	
	}
}