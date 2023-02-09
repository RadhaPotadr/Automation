package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;

public class Duplicate {

	public static void main(String[] args) {
		String s = "i am radha i am 28 years old i live in dublin i like snow radha is looking softwre testing roles in dublin area";
		String split[] = s.split(" ");
		List l = new ArrayList();
		for (int i = 0; i < split.length; i++) {
			l.add(split[i]);
		}
		System.out.println(l);

		Set<String> one = new HashSet<String>(l);
		Iterator<String> itr = one.iterator();
		while (itr.hasNext()) {
			String num = itr.next();
			System.out.println(num + " - has occurace - " + Collections.frequency(l, num));
		}
		int count=0;
		int value=0;
		Iterator<String> it = one.iterator();
		while (it.hasNext()) {
			String num = it.next();
			if (Collections.frequency(l, num) > 1) {
				count++;
				System.out.println(num + " - is duplicate ");
			} else {
				value++;
				System.out.println(num + " - is unique ");
			}
		}System.out.println(value+ " no of unique elements ");
		System.out.println(count+ " no of duplicate elements ");
	}
}
