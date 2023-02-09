package day3.forloop;

public class Evenodd {
	public static void main(String[] args) {   
		int number=55;   
		if(number%2==0){  
			System.out.println("even number");  
		}else{  
			System.out.println("odd number");  
		}  
		checkEvenOddNumber(150);
		isNumberEven(150);
		System.out.println(isNumberEven(150));
	} 
	/** static method with argument/parameter and return type as void */
	static void checkEvenOddNumber(int num) {
		if(num%2==0){  
			System.out.println("Given number is even number: "+num);  
		}else{  
			System.out.println("Given number is odd number: "+num);  
		}
	}
	/**static method with argument and return type as boolean */
	static boolean isNumberEven(int num) {
		if(num%2==0){  
			return true;
		}else{  
			return false;
		}
	}

}
