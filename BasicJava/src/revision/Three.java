package revision;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
public class Three {
	public static void main(String[] args) {
		List<Integer> validate= new ArrayList<Integer> ();
		validate.add(9);
		validate.add(19);
		validate.add(22);
		validate.add(34);
		validate.add(56);
		validate.add(74);
		List<Integer> original= new ArrayList<Integer> (validate);
		System.out.println(validate);
		System.out.println("copy of original list : "+original);
		Collections.sort(validate);
		List<Integer> asce= new ArrayList<Integer> (validate);
		System.out.println("ascending list : "+asce);
		List<Integer>copyofasce= new ArrayList<Integer> (asce);
		System.out.println("copy of ascending list : "+copyofasce);
		Collections.reverse(asce);
		List<Integer> desc= new ArrayList<Integer> (asce);
		System.out.println("descending list : "+desc);
		if(original.equals(copyofasce)) {
			System.out.println("given list is already sorted in ascending order");
		}
		else if(original.equals(desc)) {
			System.out.println("given list is already sorted in descending order");
		}
		else {
			System.out.println("given list is not already sorted in any order");
		}
	}
}
