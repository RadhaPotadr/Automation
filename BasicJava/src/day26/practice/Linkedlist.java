package day26.practice;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList <Integer> lin= new LinkedList<Integer>();
		lin.add(23);
		lin.add(93);
		lin.add(43);
		lin.add(63);
		System.out.println("linkelist elements :"+lin);
		lin.addFirst(34);
		lin.addLast(4);
		System.out.println("linkelist elements :"+lin);
		for(int i =0;i<lin.size();i++) {
			if (lin.get(i)==23) {
				lin.set(i,10);
			}
		}System.out.println("linkelist elements :"+lin);
	}

}
