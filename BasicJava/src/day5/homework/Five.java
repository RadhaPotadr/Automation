package day5.homework;

public class Five {

	public static void main(String[] args) {
		/*int num1 =25;
		int num2= 10;
		System.out.println("before num1 :"+num1);
		System.out.println("before num2 :"+num2);
		int temp= num1+num2;
		num1=temp-num1;
		num2=temp-num2;
		System.out.println("after num1 :"+num1);
		System.out.println("after num2 :"+num2);*/
		
		swap(25,10);
	}
	static void swap (int num1, int num2) {
		System.out.println("before num1 :"+num1);
		System.out.println("before num2 :"+num2);
		int temp= num1+num2;
		num1=temp-num1;
		num2=temp-num2;
		System.out.println("after num1 :"+num1);
		System.out.println("after num2 :"+num2);
	}
}
