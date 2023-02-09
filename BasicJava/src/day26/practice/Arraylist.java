package day26.practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
public class Arraylist {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add("dinesh");
		a1.add("rajshree");
		a1.add("khushboo");
		a1.add("radha");
		a1.add("anshul");
		System.out.println("elements of family potdar:"+a1);
		List a2=new  ArrayList();
		a2.add("parth kumar");
		a2.add("ankur kumar");
		System.out.println("element jamais of family potdar:"+a2);
		List a3=new  ArrayList();
		a3.add("pakhi");
		a3.add("yet to plan");
		System.out.println("element of 3rd gen of family potdar:"+a3);
		a1.addAll(a2);
		System.out.println("all potdars till 2nd gen:"+a1);
		a1.addAll(a3);
		System.out.println("all potdars till 3rd gen:"+a1);
		a1.set(8,"not yet");
		System.out.println("all potdars till 3rd gen:"+a1);
		ArrayList a4= new ArrayList();
		System.out.println("status  :"+a4.isEmpty());
		a4.add("dinesh");
		a4.add("rajshree");
		a4.add("khushboo");
		a4.add("radha");
		a4.add("anshul");
		System.out.println("status  :"+a4.isEmpty());
		System.out.println("4th family members :"+a4.get(3));
		System.out.println("count of family members :"+a4.size());
		System.out.println("elements of family potdar:"+a4);
		a4.add(3, "parth");
		System.out.println("5th family members :"+a4.get(4));
		System.out.println("count of family members :"+a4.size());
		System.out.println("elements of family potdar:"+a4);
		a4.add(5, "ankur");
		System.out.println("6th family members  : "+a4.get(5));
		System.out.println("count of family members :"+a4.size());
		System.out.println("elements of family potdar:"+a4);
		a4.add("pakhi");
		System.out.println("*********************************");
		for(int  i=0;i<a4.size();i++) {
			System.out.println(a4.get(i));
		}
		System.out.println("*********************************");
		for (Object o1: a4) {
			System.out.println(o1);
		}
		System.out.println("*********************************");
		Iterator it= a4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
		System.out.println("*********************************");
		Collections.sort(a4);
		System.out.println("sorted elements: "+a4);
		System.out.println("*********************************");
		Collections.reverse(a4);
		System.out.println("reverse elements: "+a4);
		System.out.println("*********************************");
		
	}
	
	
	
	
	
	

}
