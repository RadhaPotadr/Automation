package day5.homework;

public class Whilehw4 {

	public static void main(String[] args) {
		  int num=31, i=2, count=0;
	      while(i<num)
	      {
	         if(num%i == 0)
	         {
	            count++;
	         }
	         i++;
	      }
	      if(count==0)
	         System.out.println("\n" +num+ " is a Prime Number.");
	      else
	         System.out.println("\n" +num+ " is not a Prime Number.");
	   }
}
