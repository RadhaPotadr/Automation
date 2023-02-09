package day24.scanner;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter required number:");
		int num=sc.nextInt();
		cube(num);
		System.out.println("Enter required number:");
		int num1=sc.nextInt();
		circle(num1);
	}
	
	static void cube(int num) {
		int res=num*num*num;
		System.out.println("Cube is : "+res);
	}
	static void circle(int num1) {
	double res1=3.14*num1*num1;
		System.out.println("Cube is : "+res1);
	}
}
