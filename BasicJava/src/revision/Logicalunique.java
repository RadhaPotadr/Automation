package revision;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
public class Logicalunique {
	public static void main(String[] args) {
		List<Integer> validate = new ArrayList<Integer>();
		validate.add(9);
		validate.add(19);
		validate.add(22);
		validate.add(19);
		validate.add(56);
		validate.add(9);
		System.out.println(validate);
		List<Integer> copyvalidate = new ArrayList<Integer>();
		copyvalidate.add(0);
		copyvalidate.add(0);
		copyvalidate.add(0);
		copyvalidate.add(0);
		copyvalidate.add(0);
		copyvalidate.add(0);
		 int count = 0; 
		 for (int i = 0; i < validate.size(); i++) { 
			 for (int j = i + 1; j < validate.size(); j++) {
				 if (validate.get(i) == (validate.get(j))) {
		  count++; copyvalidate.set(j, -1);
		  }
				 } if (copyvalidate.get(i) != -1) {
		  copyvalidate.set(i, count);
		  } 
				 count = 0; 
		  } System.out.println(copyvalidate);
		  int value = 0; for (int i = 0; i < validate.size(); i++) { 
			  if (copyvalidate.get(i) > 0) {
				  value++;
		  System.out.println("duplicate list elements  : " + validate.get(i)); } }
		 System.out.println("count of duplicate elements : " + value); 
		 int value1 = 0;
		  for (int i = 0; i < validate.size(); i++) { 
			  if (copyvalidate.get(i) == 0) {
		 value1++; System.out.println("unique list elements : " + validate.get(i)); 
		 }
		 } System.out.println("count of unique elements : " + value1);
		 
	}
}
