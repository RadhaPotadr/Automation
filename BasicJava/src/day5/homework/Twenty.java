package day5.homework;

public class Twenty {

	public static void main(String[] args) {
		int num=15,i,count=0;
		for(i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
			System.out.println(i);
		}
		}System.out.println(count);
		} 
	}
		
				