package day5.homework;

public class Seventeen {

	public static void main(String[] args)   
	{  
	int number =112345, reverse = 0;  
	for(int i=0;i<=number;i++)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder; 
	number=number/10;
	i=0;
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	}