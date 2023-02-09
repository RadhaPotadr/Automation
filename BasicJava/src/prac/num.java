package prac;

public class num {

	public static void main(String[] args) {
		System.out.println(" ********************prime**************");
		int a = 8;
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("not prime");
		} else {
			System.out.println(" prime");
		}
		System.out.println(" ************************palindrome***********************");
		int b = 1212130;
		int rev = 0;
		int temp = b;
		for (int i = 0; i <= b; i++) {
			int rem = b % 10;
			rev = rev * 10 + rem;
			b = b / 10;
			i = 0;
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println(" not palindrome");
		}
		System.out.println(" ************************armsrtome***********************");
		int num = 407;
		int temp1=num;
		int store=num;
		int cou = 0;
		while (num != 0) if((num = num / 10)>=0)
		{
			cou++;	
		}
		System.out.println(cou);
		int arm=0;
		int rem1=0;
		for(int i=0;i<=temp1;i++) {
			rem1=temp1%10;
			arm=(int)(arm + (Math.pow(rem1, cou)));
			temp1=temp1/10;
			i=0;
		}
		System.out.println(arm);
		if(store==arm) {
			System.out.println("armstrong");
		}
		else {
			System.out.println(" no armstrong");
		}
		System.out.println(" ************************factorial and sum***********************");
		int f=5;
		int multi=1;
		int sum=0;
		for(int i=1;i<=f;i++) {
			multi=multi*i;
			sum=sum+i;
		}
		System.out.println(multi);
		System.out.println(sum);
		System.out.println(" ********************Fibonacci***************************");
		int one=0;
		int two=1;
		int sumof2=0;
		int n=5;
		for(int i=0;i<=n;i++) {
			sumof2=one+two;
			one=two;
			two=sumof2;
			System.out.println(sumof2);
		}
		System.out.println(" ********************swap**************************");
		int x=10;
		int y=9;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
