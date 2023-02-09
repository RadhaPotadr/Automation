package day26.practice;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
public class Que {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(30);
		queue.add(70);
	    queue.add(27);
		queue.add(12);
		System.out.println("elements of que : "+queue);
		for (Integer i : queue) {
			System.out.println(i);
		}
		System.out.println("************************");
		Iterator <Integer>itr= queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("************************");
		  
		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println("elements i n que : "+queue);
	}

}
