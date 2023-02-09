package revision;
import java.util.Scanner;
public class one {
 static void addition(double a, double b) {
	 System.out.println("addition of given numbers is : "+ (a+b));
 }
 static void sub(double a, double b) {
	 System.out.println("substraction of given numbers is : "+ (a-b));
 }
 static void multi(double a, double b) {
	 System.out.println("multiplication of given numbers is : "+ (a*b));
 }static void divi(double a, double b) {
	 System.out.println("division of given numbers is : "+ (a/b));
 }
 static void prime(int num) {
	 int count=0;
	 if(num>2) {
	 for(int i=2;i<num;i++) {
		 if(num%i==0) {
			 count++;
		 }
	 }
	 if(count>0) {
		 System.out.println(num+" is not prime");
	 }
	 else{
		 System.out.println(num+ " is prime");
	 }
	 }
	 else {
		 System.out.println("number is either 0,1,2");
	 }
 }
 static void evenodd (int value) {
	 if (value %2==0) {
		 System.out.println(value+" is even number");
	 }
	 else {
		 System.out.println(value+" is odd number");
	 }
 }
 static void posinegi(int x) {
	 if (x<0) {
		 System.out.println(x+ " is negative");
	 }
	 else 
	 {
		 System.out.println(x+ " is positive");
	 }
 }
 static void alpha(char c1) {
	 if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='o')||(c1=='u')) {
		 System.out.println(c1+" is vowel");
	 }
	 else {
		 System.out.println(c1+" is consonant");
	 }
 }
 static void swap(int a, int b) {
	 a=a+b;
	 b=a-b; 
	 a=a-b;
	 System.out.println("value of a is "+a);
	 System.out.println("value of b is "+b);
 }
 static void max(int a,int b,int c) {
	 if((a>b)&&(a>c)) {
		 System.out.println(a+"  is greatest");
	 }
	 else if ((b>a)&&(b>c)) {
		 System.out.println(b+"  is greatest");
	 }
	 else {
		 System.out.println(c+"  is greatest"); 
	 }
	 }static void min(int a,int b,int c) {
		 if((a<b)&&(a<c)) {
			 System.out.println(a+"  is smallest");
		 }
		 else if ((b<a)&&(b<c)) {
			 System.out.println(b+"  is smallest");
		 }
		 else if ((c<a)&&(c<b)){
			 System.out.println(c+"  is smallest"); 
		 }
		 else {
			 System.out.println("either of them are equal");
		 }
		 }
	 static void ascii(char c2) {
		 int a= c2;
		 System.out.println("ascii value of "+c2+"is: "+a);
	 }
	 static void leap(int year) {
		 if((year%400==0)||(year%100!=0)&&(year%4==0)) {
			 System.out.println(year+" year is leap");
		 }
		 else {
			 System.out.println(year +" year is not leap");
		 } 
	 }
	 static void count(int a) {
		 int count=0;
		 int num=a;
		 if (a!=0) {
		 for(int i=0;i<a;i++) {
			 if((a=a/10)>=0) {
				 count++;
			 }
		 }
		 System.out.println(num +" has "+count+" digits");
		 }
	 }
	 static void reverse(int a) {
		 int rev=0;
		 int num=a;
		 for(int i=0;i<a;i++) {
			 int rem= a%10;
			 rev=rev*10+rem;
			 a=a/10;
			 i=0;
		 }
		 System.out.println(num+ " has reverse value "+rev);
	 }
	 static void palindrome(int a) {
		 int rev=0;
		 int temp=a;
		 for(int i=0;i<a;i++) {
			 int rem= a%10;
			 rev=rev*10+rem;
			 a=a/10;
			 i=0;
		 }
		 if(temp==rev) {
			 System.out.println(temp+" is palindrome");
		 }
		 else {
			 System.out.println(temp+" is not palindrome");
		 }
	 }
 public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("enter the value");
	double a=src.nextDouble();
	double b=src.nextDouble();
	int num=src.nextInt();
	int value=src.nextInt();
	int x=src.nextInt();
	System.out.println("enter the value");
	char c1=src.next().charAt(0);
	int y=src.nextInt();
	int z=src.nextInt();
	int p=src.nextInt();
	int q=src.nextInt();
	int r=src.nextInt();
	System.out.println("enter the value");
	char c2=src.next().charAt(0);
	int s=src.nextInt();
	 addition(a,b);
	 sub(a,b);
	 multi(a,b);
	 divi(a,b);
	 System.out.println("***********************");
	 prime(num);
	 evenodd(value);
	 posinegi(x);
	 alpha(c1);
	 swap(y,z);
	 max(p,q,r);
	 min(p,q,r);
	 ascii(c2);
	 count(s);
	 reverse(s);
	 palindrome(s);
	 
	 
	 
	 
}
}