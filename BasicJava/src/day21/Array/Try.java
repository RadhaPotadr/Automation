package day21.Array;
import java.util.Arrays;
public class Try {
	public static void main(String[] args) {
		int [] original= {0,18,24,78,89,91,100,37,40,53,60};
		for(int i=0;i<original.length;i++) {
			System.out.println(original[i]);
		}
	System.out.println("-----------------1.for each loop--------------------");
		for(int a:original) {
			System.out.println(a);
		}
	System.out.println("------------------2.reverse----------------------");
		for(int j=original.length-1;j>=0;j--) {
			System.out.println(original[j]);
		}
	System.out.println("----------------3.sort/ascending----------------");
     Arrays.sort(original);
     for(int a:original) {
			System.out.println(a);
		}
     System.out.println("-------------------4.copy---------------------");
     int[]copy=Arrays.copyOf(original, 11);
     for(int a:copy) {
			System.out.println(a);
		}
     System.out.println("----------------copy------------------------");
     int[]copy1=Arrays.copyOf(original, original.length);
     for(int a:copy1) {
			System.out.println(a);
		}
     System.out.println("------------------5.copy range ----------------------");
     int[]copy2=Arrays.copyOf(original, 7);
     for(int a:copy2) {
			System.out.println(a);
		}
     System.out.println("-----------------copy range--------------------");
     int[]copy3=Arrays.copyOfRange(original, 0, 5);
     for(int a:copy3) {
			System.out.println(a);
		}
     System.out.println("--------------------6.min--------------------");
     int min=original[0];
     for(int i=0;i<original.length;i++) {
    	 if (min>original[i]) {
    			 min=original[i];}	
    	 }
     System.out.println("min is:"+ min);
     System.out.println("----------------7.max-----------------------");
     int max=original[0];
     for(int i=0;i<original.length;i++) {
    	 if (max<original[i]) {
    			 max=original[i];}	
    	 }
     System.out.println("max is:"+ max);
     System.out.println("-------------------8.descending--------------------");
     Arrays.sort(original);
     for(int i=original.length-1;i>=0;i--) {
    	System.out.println(original[i]);
     }
     System.out.println("-------------------9.even position--------------------");
   for(int i=1;i<original.length;i=i+2) {
	   System.out.println("numbers on even position : "+ original[i]);
   }
   System.out.println("-------------------10.odd position--------------------");
   for(int i=0;i<original.length;i=i+2) {
	   System.out.println("numbers on odd position : "+ original[i]);
   }
   System.out.println("------------------11.sum--------------------");
   int sum=0;
   for(int i=0;i<original.length;i++) {
	   sum=sum+original[i];
   }
   System.out.println("sum of all numbers =" + sum);
   System.out.println("------------------12.avg--------------------");
   System.out.println("avg of all numbers="+ sum/original.length);
   System.out.println("------------------13.second lagrest--------------------");
   Arrays.sort(original);
   for(int i=original.length-2;i>=original.length-2;i--)
   {
  	System.out.println(original[i]);
   }
   //System.out.println(original[original.length-2]);
   System.out.println("------------------third lagrest--------------------");
   Arrays.sort(original);
   for(int i=original.length-3;i>=original.length-3;i--) 
   {
  	System.out.println(original[i]);
   } System.out.println("------------------fourth lagrest--------------------");
   Arrays.sort(original);
   for(int i=original.length-4;i>=original.length-4;i--)
   {
  	System.out.println(original[i]);
   }
   System.out.println("------------------14.second smallest--------------------");
   Arrays.sort(original);
   for(int i=1;i<=1;i++)
   {
  	System.out.println(original[i]);
   }
 	//System.out.println(original[1]);

   System.out.println("------------------third smallest--------------------");
   Arrays.sort(original);
   for(int i=2;i<=2;i++)
   {
  	System.out.println(original[i]);
   }
   System.out.println("------------------fourth smallest--------------------");
   Arrays.sort(original);
   for(int i=3;i<=3;i++)
   {
  	System.out.println(original[i]);
   }
   System.out.println("------------------15.even number--------------------");
     for(int i=0;i<original.length;i++) {
		 if((original[i]%2==0)&&(original[i]!=0)) 
		 {
			 System.out.println(original[i]);
	   }    
   }  
     System.out.println("------------------16.odd number--------------------");
     for(int i=0;i<original.length;i++) {
		 if((original[i]%2!=0)&&(original[i]!=0)) 
		 {
			 System.out.println(original[i]);
	   }    
   } 
     System.out.println("---------------17.right rotation-----------------");
     int arr[]= {1,2,53,4,35};
     int brr[] = new int [arr.length];
     //System.out.println(arr.length);
     //System.out.println(brr.length);
     brr[0]=arr[arr.length-1];
     for(int i=0;i<arr.length;i++) {
    	 for(int j=i+1;j<brr.length;j++) {
    		 brr[j]=arr[i];
    	 }
		 System.out.println(brr[i]);
    	 }
     System.out.println("---------------18.left rotation-----------------");
     int arr1[]= {1,2,53,4,35};
     int brr1[] = new int [arr1.length];
	 brr1[brr1.length-1]=arr1[0];
     for(int i=1;i<arr1.length;i++) {
        	 for(int j=i-1;j<i;j++) {
    		 brr1[j]=arr[i];
    	 }
     }
     for(int k=0;k<brr1.length;k++)
     System.out.println(brr1[k]);
     System.out.println("------------------19.frequency----------------");
     int fre[]= {1,3,2,5,6,8,3,2,9};
     int freq[]=new int [fre.length];
     int count=1;
     for(int i=0;i<fre.length;i++) {
    	 for(int j=i+1;j<freq.length;j++) {
    		 if(fre[i]==fre[j]) {
    			 count++;
    			 freq[j]=-1;
    		 }
    	 }if(freq[i]!=-1) {
    		 freq[i]=count; 
    		 System.out.println(fre[i]+" has frequncy of "+ count);
    	 }
    	 count=1; 
     }
     System.out.println("------------------20.duplicate---------------");
     int duplicate[]= {1,2,4,1,2,5,6,1};
     int duplicate1[]=new int [duplicate.length];
     int count1=1;
     for(int i=0;i<duplicate.length;i++) {
    	 for(int j=i+1;j<duplicate1.length;j++) {
    		 if (duplicate[i]==duplicate[j]) {
    			 count1++;
    			 duplicate1[j]=-1;
    		 }
    	 }
    	 if ( duplicate1[i]!=-1) {
    		 duplicate1[i]=count1;
       	 } 
    	 count1=1;
     }
     for(int k=0;k<duplicate.length;k++) {
    	 if(duplicate1[k]>1) {
    		 System.out.println( duplicate[k]+" :is duplicate");
    	 }
     }
     System.out.println("-------------21.remove duplicate----------------");
     int duplicate2[]= {1,2,4,1,2,5,6,1};
     int duplicate3[]=new int [duplicate2.length];
     int count2=1;
     for(int i=0;i<duplicate2.length;i++) {
    	 for(int j=i+1;j<duplicate3.length;j++) {
    		 if (duplicate2[i]==duplicate2[j]) {
    			 count2++;
    			 duplicate3[j]=-1;
    		 }
    	 }
    	 if ( duplicate3[i]!=-1) {
    		 duplicate3[i]=count2;
       	 } 
    	 count2=1;
     }
     int next=0;
     for(int k=0;k<duplicate2.length;k++) {
    	 if(duplicate3[k]==1) {
    		 next++;	
    	 }
     } System.out.println( next+"   unique elements in array");
     int value=0;
     int unique[]=new int [next];
     for(int l=0;l<duplicate2.length;l++) {
    	 if(duplicate3[l]==1) {
    		 unique[value]= duplicate2[l];
    		 System.out.println(unique[value]);
    		 value++;
    	 }
     }
     
}}
	