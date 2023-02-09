package day3.forloop;

public class Whileloop1 {

	public static void main(String args[]) {
		int i = 4;
		System.out.println("Printing numbers from 4 to 0");
		while (i >= 0) {
			System.out.println("Hello " + i);
			i--;
		}

		char c1 = 'a';
		while (c1 <= 'z') {
			System.out.print(c1 + " ");
			c1++;
		}
		System.out.println("\n***Reverse***");
		char c2 = 'z';
		while (c2 >= 'a') {
			System.out.print(c2 + " ");
			c2--;
		}
		System.out.println();
		int num=1;
		while(num<=50) {
			if(num%2==0) {
			System.out.println("Even number is: "+num);
			}
			num++;
		}
		int num2=1;
		while(num2<=50) {
			if(num2%2!=0) {
			System.out.println("Odd number is: "+num2);
			}
			num2++;
		}
	}

}
