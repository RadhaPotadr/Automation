package day1.basicprograms;

public class Simpleintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long P= 30000;
		double R= (7.8/100);
		double T= 2.6;
		double I= P*R*T;
		double A= P*(1+R*T);
		System.out.println("intrest :"+I);
		System.out.println("final amount :"+A);
	}

}
