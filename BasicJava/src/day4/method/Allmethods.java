package day4.method;

public class Allmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addNumbers (10,20,30);
		substractNumbers (13,23,33);
		multiplyNumbers (14,24,34);
		divideNumbers (12,4);
		addNumbers (10,20,30);
		substractNumbers (56,13,3);
		multiplyNumbers (4,3,5);
		divideNumbers (21,3);
	}
		public static int addNumbers (int a,int b, int c) {
			int res = a+b+c;
			System.out.println("addition of numbers =" + res);
			return res;
		}
		public static void substractNumbers (int x,int y, int z) {
			int res = x-y-z;
			System.out.println("substration of numbers =" + res);
		}
		public static void multiplyNumbers (int p,int q, int r) {
			int res = p*q*r;
			System.out.println("multiplication of numbers =" + res);
		}
		public static void divideNumbers (int e,int f) {
			int res = e/f;
			System.out.println("division of numbers =" + res);
		}
	}

