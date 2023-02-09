package day5.homework;

public class Ten {

	public static void main(String[] args) {
		leapyear(2004);
		System.out.println(leapyearcheck(2007));
	}
  static void leapyear(int a) {
	  if((a%4==0)&&(a%100!=0) || (a%400==0)) {
		  System.out.println("leap year");
	  }
	  else{
		  System.out.println("non leap year");
	  }
  }
	  static boolean leapyearcheck(int b) {
		  if((b%4==0)&&(b%100!=0) || (b%400==0)) {
			  System.out.println("leap year");
		 
		  return true;}
		  else
		  {
			  System.out.println("non leap year");
		  return false;}
  }
}
