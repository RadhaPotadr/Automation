package day26.practice;
import java.util.Scanner;
public class Enter {
	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		System.out.println("enter a value");
		int num;
		while(true) {
			num=src.nextInt();
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
				 break;
			 }
			 }

	}

}}
