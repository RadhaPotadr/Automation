package day4.method;

public class Methodofintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(getintrest(10000,2,5.6f));}
		 double amountofintrest=getintrest(150000,5,6.5f);
		System.out.println("amount of intrest is :" + amountofintrest);
		double finalamount = amountofintrest+ 150000;
		System.out.println("final amount is :" + finalamount);
		double updatedamountofintrest=getintrest(250000,9,5.5f);
		System.out.println("amount of intrest is :" + updatedamountofintrest);
		double updatedfinalamount = updatedamountofintrest+ 250000;
		System.out.println("final amount is :" + updatedfinalamount);
	}
	
	static double getintrest(int amount, int noy, float roi) {
		double intrest= (amount*noy*roi)/100;
		return intrest ;
	}

}
