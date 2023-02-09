package day5.homework;

public class Eighteen {

	public static void main(String[] args) {
		int num=132313,rev=0,temp=num;
		for(int i=0;i<=num;i++) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			i=0;
		}
		System.out.println(rev);
		if(temp==rev)
		{System.out.println("number is palindrome");
	}
	else {
	System.out.println("number is not palindrome");
}	
		}
	}

