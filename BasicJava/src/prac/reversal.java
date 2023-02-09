package prac;

public class reversal {

	public static void main(String[] args) {
		System.out.println("*************rev whole string *******************");
		String s="radha is my name";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		System.out.println("*************split*******************");
		String a="radha dinesh potdar";
		System.out.println(a);
		String arraytype[]=a.split(" ");
		for(String o: arraytype) {
			System.out.println(o);
		}
		System.out.println("************* rev split*******************");
		for(int i=arraytype.length-1;i>=0;i--)	{
			System.out.println(arraytype[i]);
		}
		System.out.println("*************rev each word *******************");
		for(int i=0;i<arraytype.length;i++) {
			for(int j=arraytype[i].length()-1;j>=0;j--) {
				System.out.print(arraytype[i].charAt(j));
			}
			System.out.print("  ");
		}
		System.out.println("  ");
		System.out.println("*************rev/palindrom *******************");
		String ex="malayalam";
		String rev="";
		for(int i=ex.length()-1;i>=0;i--) {
			rev=rev+ex.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(ex)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
		System.out.println("*************repeted  *******************");
		String space="radha is my name";
		for(int i=0;i<space.length()-1;i++) {
			for(int j=i+1;j<space.length();j++)	
			if(space.charAt(i)==(space.charAt(j))){
				System.out.println(space.charAt(i));
				break;
			}	
		}
		System.out.println("*************prserve spaces *******************");
		
		
		
		
		
		
		
		
		
		
	
	}
	}