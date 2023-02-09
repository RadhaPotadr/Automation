package day21.Array;
public class Trial {
	public static void main(String[] args) {
		  char letters[]= {'a','b','c','d','e'};
		for(char let : letters) {
			System.out.println(let);
		}
		System.out.println("----------------------------------------");
		for(int i=0;i< letters.length;i++) {
			System.out.println(letters[i]);
		}
		
		int id[]= {12,14,23,65,78,90,87,65,84,45};
		for(int num : id) {
			if(num>=40) {
				System.out.println("id"+ num +" is moving to manual team");
			}
			else {
				System.out.println("id"+ num +" is not moving to manual team");
			}
		}
		System.out.println("----------------------------------------");	
		int evenodd[]= {34,33,56,78,87,98,76,77,65,44,32,23,12,15,17,85};
		for(int num:evenodd) {
			if (num/2==0){
				System.out.println("num"+ num +" is even number");
			}
			else {
				System.out.println("num"+ num +" is not even number");
			}
		}
		System.out.println("----------------------------------------");		
		int minmax[]= {21,25,68,98,20,65};
		int min = minmax[0];
		for(int i=0;i<minmax.length;i++) {
			if(minmax[i] < min) {
				min = minmax[i];
			}
		}
		System.out.println(min);
		int min1 = minmax[0];
		for(int x: minmax) {
			if(x<min1) {
				min1 = x;
			}
		}
		System.out.println(min1);
		System.out.println("----------------------------------------");		
		int duplicate[]= {3,34,45,3,6,12,23,43,12,5,45};
			for(int k=0;k<duplicate.length;k++) {
			for(int j=k+1;j<duplicate.length;j++) {
				if(duplicate[j] == duplicate[k]) {
				System.out.println(duplicate[k]);
				}
			}}
			System.out.println("----------------------------------------");		
			
			
			}}


