package day5.homework;

public class Six {

	public static void main(String[] args) {
		int a= 32;
		if (a%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
		System.out.println(checkevenodd(33));
		evenodd(34);
	}
	   static void evenodd (int c) {
		   if (c%2==0) {
				System.out.println("number is even");
			}
			else {
				System.out.println("number is odd");
			}
		   }
	
	static boolean checkevenodd(int b) {
		if (b%2==0) {
			return true;}
			else { 
				return false;
			}
		}
	}

