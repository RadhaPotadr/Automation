package arrayhome;

public class One {
	public static void main(String[] args) {
		char alphabet[]= {'A','B','C','D','E','F'};
		int size=alphabet.length;
		char copy[]=new char [size];
		for(int i=0;i<alphabet.length;i++) {
			copy[i]=alphabet[i];
		}
		System.out.println(alphabet);
		System.out.println(copy);
		System.out.println("----------------------------------------");	
		
    for(int i=alphabet.length-1;i>=0;i--) {
    	System.out.println(alphabet[i]);
    }
    System.out.println("----------------------------------------");	
    
    for(int i=2;i<alphabet.length;i=i+2) {
    	System.out.println(alphabet[i]);
    }
    System.out.println("----------------------------------------");	
    
    for(int i=1;i<alphabet.length;i=i+2) {
    	System.out.println(alphabet[i]);
    }
    System.out.println("----------------------------------------");	
    
    int example[]= {2,8,9,4,3,7,6,0};
    int min=example[0];
    for(int i=0;i<example.length;i++) {
    	if(example[i]<min){
    		min=example[i];
    	}
    }System.out.println(min);
    System.out.println("----------------------------------------");	
    int max=example[0];
    for(int i=0;i<example.length;i++) {
    	if(example[i]>max){
    		max=example[i];
    	}
    }System.out.println(max);
    System.out.println("----------------------------------------");	
   }}
