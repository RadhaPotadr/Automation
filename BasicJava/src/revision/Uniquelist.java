package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;

public class Uniquelist {
	public static void main(String[] args) {
		List<Integer> validate = new ArrayList<Integer>();
		validate.add(9);
		validate.add(19);
		validate.add(22);
		validate.add(19);
		validate.add(56);
		validate.add(9);
		System.out.println(validate);
		Set<Integer> copyvalidate = new HashSet<Integer>(validate);
		System.out.println(copyvalidate.size());
		Iterator<Integer> itr = copyvalidate.iterator();
		for (int i = 0; i < copyvalidate.size(); i++) {
			if (itr.hasNext()) {
				int num = itr.next();
				System.out.println(num + " occurance is " + Collections.frequency(validate, num));
			}
		}
		
	}
}