package day26.practice;
import java.util.*;
public class One {
	public static void main(String[] args) {
		Scanner obj= new Scanner (System.in);
		System.out.println("enter the number");
		int n= obj.nextInt();
		int count=0;
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				count++;
				}
		}if(count<0)
		{System.out.println( n+"is not prime");}
		else {
			System.out.println( n+"is  prime");
		}

	}

}
