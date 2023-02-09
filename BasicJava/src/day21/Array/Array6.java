package day21.Array;
import java.util.Arrays;

public class Array6 {
	public static void main(String args[]) {
		int[] num1= {5,2,55,80,100,20,3};
		for(int a:num1) {
			System.out.println(a);
		}
		//sort will sort the elements of an array in ascending order and stores in the same array
		Arrays.sort(num1);
		System.out.println("************num1 after sorting***************");
		for(int a:num1) {
			System.out.println(a);
		}
		System.out.println("***********CopyOf array*******************");
		int copyArray1[]=Arrays.copyOf(num1, num1.length);
		for(int num:copyArray1) {
			System.out.println(num);
		}
		System.out.println("***********CopyOf array*******************");
		int copyArray[]=Arrays.copyOf(num1, 10);
		for(int num:copyArray) {
			System.out.println(num);
		}
		System.out.println("*************CopyRange array***************");
		int[] num2=Arrays.copyOfRange(num1, 0, 10);
		for(int a:num2){
			System.out.println(a);
		}
		System.out.println("*************CopyRange array***************");
		int[] num3=Arrays.copyOfRange(num1, 0, 5);
		for(int a:num3){
			System.out.println(a);
		}
		System.out.println("*************CopyRange array***************");
		int[] num4=Arrays.copyOfRange(num1, 2, 5);
		for(int a:num4){
			System.out.println(a);
		}
			}
}
