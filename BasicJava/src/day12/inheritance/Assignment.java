package day12.inheritance;
class kid extends Assignment{
	void reversenumber(int a) {
		super.reversenumber(2872);
		super.leap(2025);
		System.out.println("this is kid class reverse number method");
	}void palindrom(int b) {
		System.out.println("this is kid class palindrome number method");
		super.palindrom(656);
	}void leap(int c) {
		super.palindrom(245);
		super.checkmethod();
		 System.out.println("this is kid class leap year method");
	 }
	void extramethod() {
		super.plusmethod();
		System.out.println("this kid class extra method");
	}static void checkmethod() {
		System.out.println("this is static check method of kid class");
	}
}
public class Assignment {
	void plusmethod() {
		System.out.println("this is plus method of parent class");}
	static void checkmethod() {
			System.out.println("this is static check method of parent class");
		}
	 void reversenumber(int a) {
		int i=0, num=a, rev=0;
		for (i=0;i<=num;i++) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		i=0;
		}
		System.out.println(rev);
			}
	 void palindrom(int b) {
		int j=0, num1=b,reverse=0,temp=num1;
		for(j=0;j<=num1;j++) {
			int rem=num1%10;
			reverse=reverse*10+rem;
			num1=num1/10;
			j=0;	
			}
	//	System.out.println(reverse);
		
		if(temp==reverse) {
			System.out.println(temp+" is palindrome number");}
		else {
			System.out.println(temp+" is not palindrome number");}
	}
	 void leap(int c) {
		int year=c;
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println(year+" year is leap year");
		}
		else {
			System.out.println(year+" year is not leap year");
		}
	}
	public static void main(String[] args) {
		Assignment obj1= new Assignment();
		obj1.reversenumber(4567);
		obj1.palindrom(121);
		obj1.leap(2012);
        kid obj2=new kid();
        obj2.reversenumber(534);
		obj2.palindrom(198);
		obj2.leap(2018);
		obj2.extramethod();
		obj2.checkmethod();
	Assignment obj3=new kid();
	obj3.reversenumber(46534);
	obj3.palindrom(142);
	obj3.leap(2000);
	obj3.plusmethod();
	obj3.checkmethod();
	}
        
	
	
	
	
	
	
	
	
	
	
	
	
	
}
