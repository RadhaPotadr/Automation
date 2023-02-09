package revision;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;

public class Four1 {
	public static void main(String[] args) {
		List<Integer> validate = new ArrayList();
		validate.add(9);
		validate.add(19);
		validate.add(22);
		validate.add(19);
		validate.add(56);
		validate.add(9);
		Set s = new HashSet(validate);
		Queue queue = new PriorityQueue(validate);
		System.out.println(validate);
		System.out.println(s);
		System.out.println(queue);
	}
}