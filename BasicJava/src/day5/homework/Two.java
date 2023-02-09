package day5.homework;

public class Two {

	public static void main(String[] args) {
		System.out.println(+multiplyTwonumbers(13.4f, 12.9f));
		System.out.println("multiplication of two floating numbers is :"+multiplyTwonumbers(13.4f, 12.9f));
	}
   static double multiplyTwonumbers(float f1, float f2) {
	   double res= f1*f2;
	   return res;
   }
}
