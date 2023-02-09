package revision;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("enter the number");
	int a=src.nextInt();
	int factorial=1;
 for (int i=a;i>0;i--) {
	 factorial=factorial*i;
 }System.out.println(factorial);
	}
}
