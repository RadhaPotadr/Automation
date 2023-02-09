package day5.homework;

public class Whilehw5 {

	public static void main(String[] args) {
		int num=407 ,count=0,temp=num,arm=0;
		for(int i=0;i<=num;i++) {
			if((num=num/10)>=0) {
				count++;
			}
		}
		num=407;
		System.out.println(count);
		System.out.println(num);
        int rem=0;
		for(int j=0;j<=temp;j++) {
			rem=temp%10;
			arm=(int)(arm + (Math.pow(rem, count)));
			temp=temp/10;
			j=0;
		}
		System.out.println(arm);
		if(arm==num) {
			System.out.println(num + "is armstrong number");
		}
		else{
			System.out.println(num + "is not armstrong number");
		}
	}}
