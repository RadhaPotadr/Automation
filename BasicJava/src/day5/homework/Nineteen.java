package day5.homework;

public class Nineteen {

	public static void main(String[] args) {
		
		int num=9,count = 0;
		for(int i=2;i<num;i++) 	
		
			if(num%i == 0) 
				count++;
			
		if(count > 0) {
			System.out.println(num + " number is not prime");}
		else
			System.out.println(num + " number is prime");
	}
	}
	
	

	
	