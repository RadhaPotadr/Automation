package arrayhome;

public class Reverse {

	public static void main(String[] args) {
		int a= 12345;
		int rem=0;
		int rev=0;
		for(int i=0;i<=a;i++) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			i=0;
		}
 System.out.println(rev);
	}

}
