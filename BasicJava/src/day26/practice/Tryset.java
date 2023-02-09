package day26.practice;
import java.util.HashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Tryset {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("kishan");
		set.add("gopal");
		set.add("biharilaal");
		set.add("ranchod");
		set.add("dwarkadhish");
		System.out.println("size of set :"+set.size());
		set.forEach(o->{
		System.out.println(o);
		});
		System.out.println("*******************************");
		HashSet set3 = new HashSet();
		set3.add(90);
		set3.add("dia");
		set3.add(false);
		System.out.println(set3);
		System.out.println("*******************************");
		HashSet<String> set1 = new HashSet<String>();
		set1.add("hari");
		set1.add("gopal");
		set1.add("vallabh");
		set1.add("madhav");
		System.out.println("size of set :"+set1.size());
		set1.forEach(o1->{
			System.out.println(o1);
		});
		set.retainAll(set1);
		System.out.println(set);
		set.add("biharilaal");
		set.add("ranchod");
		set.add("dwarkadhish");
		set.add("kishan");
		set.addAll(set1);
		System.out.println("size of set :"+set.size());
		System.out.println(set);
		set.remove("kishan");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		System.out.println("*******************************");
		TreeSet set2= new TreeSet();
		set2.add("kripa");
		set2.add("aadi");
		set2.add("lina");
		set2.add("vivel");
		System.out.println(set2);
		Iterator it= set2.descendingIterator();
		while(it.hasNext()) {
		System.out.println(it.next());
	}
		set2.pollFirst();
		System.out.println(set2);
		set2.pollLast();
		System.out.println(set2);
		System.out.println("*******************************");
		TreeSet <Integer>set4= new TreeSet<Integer>();
		set4.add(12);
		set4.add(29);
		set4.add(38);
		set4.add(87);
		set4.add(36);
		set4.add(12);
		set4.add(35);
		System.out.println(set4);
		set4.forEach(a->{
			System.out.println(a);
		});
		System.out.println("*******************************");
		Iterator<Integer>obj=set4.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println("*******************************");
		Iterator<Integer>obj1=set4.descendingIterator();
		while(obj1.hasNext()) {
			System.out.println(obj1.next());
		}
		System.out.println("*******************************");
		System.out.println(set4.first());
		System.out.println(set4.last());
		System.out.println(set4.higher(37));// immediate greater
		System.out.println(set4.descendingSet());
		System.out.println(set4);
		System.out.println(set4.lower(31));// immediate lower
		System.out.println("*******************************");
		System.out.println(set4.headSet(36));
		System.out.println(set4.headSet(36, true));
		System.out.println("*******************************");
		System.out.println(set4.subSet(29, 38));
		System.out.println(set4.subSet(29, true, 38, true));
		System.out.println(set4.subSet(29, false, 38, false));
		System.out.println(set4.subSet(29, false, 38, true));
		System.out.println(set4.subSet(29, true, 38, false));
		System.out.println("*******************************");
		System.out.println(set4.tailSet(36));
		System.out.println(set4.tailSet(36,false));
	}
}
