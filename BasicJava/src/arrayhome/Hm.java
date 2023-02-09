package arrayhome;
public class Hm {
	public static void main(String[] args) {
		int arr[]= {3,5,3,6,7,8,9};
		int brr[]=new int [arr.length];
		brr[arr.length-1]=arr[0];
		for (int i=0;i<arr.length-1;i++) {
			brr[i]=arr[i+1];
		}
  for(int i:brr) {
	  System.out.println(i);
  }
  System.out.println("***********************");
  int crr[]=new int [arr.length];
  crr[0]=arr[arr.length-1];
  for(int i=0;i<arr.length-1;i++) {
	  crr[i+1]=arr[i];
  }
  for(int b:crr)
  System.out.println(b);
  
  System.out.println("***********************");
  String str="i am radha dinesh potdar";
  String splited[]=str.split(" ");
  for(String s:splited) {
	  System.out.println(s);
  }
  System.out.println("***********************");
  String left []=new String [splited.length];
  left[splited.length-1]=splited[0];
  for(int i=0;i<splited.length-1;i++) {
	  left[i]=splited[i+1];
  }
  for(String o:left) {
	  System.out.println(o);
  }
  System.out.println("***********************");
  String right []=new String [splited.length];
  right[0]=splited[splited.length-1];
  for(int i=0;i<splited.length-1;i++) {
	  right[i+1]=splited[i]; 
  }
 for(String c:right) {
	 System.out.println(c);
 }
 System.out.println("***********************");
String word= "kiara is my name ";
int count=0;
for(int i=0;i<=word.length()-1;i++) {
	for(int j=i+1;j<=word.length()-1;j++)
	if (word.charAt(i)==word.charAt(j)) {
		count++;}
		if ((count>0)&&(word.charAt(i)!=' ')) {
			System.out.println(word.charAt(i)+" is repeated");	
	}
		count=0;
		}
System.out.println("***********************");
 String st="london is very beautiful";
 int c =0;
 for(int i=0;i<=st.length()-1;i++) {
	 if((st.charAt(i)=='a')||(st.charAt(i)=='e')||
	(st.charAt(i)=='i')||(st.charAt(i)=='o')||(st.charAt(i)=='u')) {
		 System.out.print(st.charAt(i)+" ");
		 c++;
	 }
 } System.out.println(c);
 System.out.println("***********************");
 String present= "radha is my name and i live in ireland";
 String check[]=present.split(" ");
 for(int i=0;i<check.length;i++) {
	 if (check[i].equals("name")) {
		 System.out.println("present");
		 break;
	 }
	 else {
		 System.out.println("absent");
	 }
 }
	}
  }


