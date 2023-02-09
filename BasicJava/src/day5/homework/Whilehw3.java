package day5.homework;

public class Whilehw3 {

	public static void main(String[] args) {
		/*int num=343,rev=0, temp=num;
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		System.out.println(rev);
		if(num==rev)
		{System.out.println("number is palindrome");
	}
	else {
	System.out.println("number is not palindrome");
}*/
		int num=3432,rev=0, temp=num;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(rev);
		if(temp==rev)
		{System.out.println("number is palindrome");
	}
	else {
	System.out.println("number is not palindrome");
}
}}