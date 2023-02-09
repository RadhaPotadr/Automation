package revision;
public class Two {
	public static void main(String[] args) {
		int original[]= {2,1,3,2,1,4,6,5,6,7,2};
		int fre[]=new int [original.length];
		int count=0;
		for(int i=0;i<original.length;i++) {
			for(int j=i+1;j<original.length;j++) {
				if(original[i]==original[j]) {
					count++;
					fre[j]=-1;	
				}
			}//System.out.println(fre[i]);
			if(fre[i]!=-1) {
				fre[i]=count;
			}//System.out.println(fre[i]);
			count=0;
		}
		int value=0;
		for(int k=0;k<original.length;k++) {
	    	 if(fre[k]>0) {
	    		 value++;
	    		 System.out.println(original[k]+" : is duplicate");
	    	 }  
	     }System.out.println(" count of duplicate : "+value);
		for(int k=0;k<original.length;k++) {
	    	 if(fre[k]==0) {
	    		 System.out.println(original[k]+" : is unique");
	    	 }
	     }
	}
}
