package day5.homework;

public class Sixteen {

	public static void main(String[] args) {

	    /*int count = 1, num = 123450;
	    if (num!=0) {
	    	for(int i=0;i<=num;i++) {
	    		for(int j=i;j<=i;j++) {
	    			if((num%10)>=0) {
	    				count++;
	    			}
	    		}
	    		num=num/10;
	    	}
	    }
	    
	    System.out.println("Number of digits: " + count);
	  }*/
		int count = 1, num = 123450232;
	    if (num!=0) {
	    	for(int i=0;i<=num;i++)  {
	    			if((num=num/10)>=0) {
	    				count++;	
	    				} 
	    			}
	    	System.out.println("Number of digits: " + count);
	}
	}}
	
