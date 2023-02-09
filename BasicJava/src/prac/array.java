package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class array {

	public static void main(String[] args) {
		System.out.println("***************2nd smallest************");
		int arr[]= {3,6,8,2,9};
		Arrays.sort(arr);
		System.out.println(arr[1]);
		System.out.println("***************2nd largest************");
		System.out.println(arr[arr.length-2]);
		System.out.println("***********multi**********");
		int a[][]={ {1,2,3},{4,5,6}};
		int b[][]={ {7,8},{9,10},{11,12}};
		int sum=0;
		int res[][]=new int [a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[i].length;j++){
				for(int k=0;k<b.length;k++) {
					sum=sum+a[i][k]*b[k][j];
				}
					res[i][j]=sum;
					sum=0;
				}			
			}		
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}System.out.println();
		}
		int c[][]={ {1,2,3},{4,5,6}};
		int d[][]={ {7,8},{9,10},{11,12}};
	    int k[][]=new int[c.length][d[0].length];
		//int k[][]= {{0,0},{0,0}};
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<d[i].length;j++) {
				for(int m=0;m<d.length;m++) {
					k[i][j]=k[i][j]+(c[i][m]*d[m][j]);
				}
			}
		}
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<k[i].length;j++) {
				System.out.print(k[i][j]+" ");
			}System.out.println();
		}
		System.out.println("********************duplicate************");
		int dup[]= {2,9,7,4,5,4,3};
		List<Integer> duplist=new ArrayList();
		for(int i=0;i<dup.length;i++) {
			duplist.add(dup[i]);
		}
		Iterator<Integer> itr=duplist.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			if (Collections.frequency(duplist, num) > 1) {
			
				System.out.println(num + " - is duplicate ");
			} 
			
		}
		System.out.println("********************anagram************");
		String str1="race";
		String str2="caoe";
		char[]str1arr=new char[str1.length()];
		for(int i=0;i<str1.length();i++) {
			str1arr[i]=str1.charAt(i);
		}
		Arrays.sort(str1arr);
		char[]str2arr=new char[str2.length()];
		for(int i=0;i<str2.length();i++) {
			str2arr[i]=str2.charAt(i);
		}
		Arrays.sort(str2arr);
		System.out.println();
		if(Arrays.equals(str2arr, str1arr) ){
			System.out.println("strings are anagram");
		}
		else {
			System.out.println("strings are not anagram");
		}
		System.out.println();
		System.out.println("***********missing num**********");
		int missing[]= {1,2,3,5,7,8};
		for(int i=0;i<=missing.length;i++) {
			if(missing[i+1]!=(missing[i]+1)) {
				System.out.println(missing[i]+1);
			}
		}
	}

}
