package day26.practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
public class Arraylist1 {
	public static void main(String[] args) {
		List list= new ArrayList();
		list.add(8);
		list.add(38);
		list.add("ken");
		list.add(null);
		list.add(8);
		list.add('r');
		list.add(false);
		System.out.println("status :"+list.isEmpty());
		System.out.println("size of list :"+list.size());
		System.out.println("elements of list : "+list);
		System.out.println("***********************************");
		for(int i=0;i<list.size();i++) {
			System.out.println("element of list :"+ list.get(i));
		}
		System.out.println("***********************************");
		for(Object obj: list) {
			System.out.println("element of list :"+ obj);
		}
		System.out.println("***********************************");
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***********************************");
		list.add("45");
		list.add(3, "triva");
		System.out.println("updated list elemnts: "+ list);
		list.set(2, true);
		System.out.println("updated list elemnts: "+ list);
		list.remove(3);
		System.out.println("updated list elemnts: "+ list);
		list.remove("45");
		System.out.println("updated list elemnts: "+ list);
		list.remove(true);
		System.out.println("updated list elemnts: "+ list);
		System.out.println("***********************************");
		List <Integer> inte= new ArrayList();
		System.out.println("status : "+ inte.isEmpty());
		inte.add(24);
		inte.add(15);
		inte.add(27);
		inte.add(64);
		inte.add(28);
		inte.add(8);
		System.out.println("status : "+ inte.isEmpty());
		System.out.println("size of integer collection : "+ inte.size());
		System.out.println("elements of interger list : "+ inte);
		 Collections.reverse(inte);
		System.out.println("reverse of integer collection : "+inte);
		Collections.sort(inte);
		System.out.println("sorting of integer collection : "+inte);
		System.out.println("***********************************");
		inte.forEach(a->{
			System.out.println(a);});
		//inte.remove(8);
		//System.out.println("elements of interger list : "+ inte);
		System.out.println("***********************************");
		List <String> stri= new ArrayList();
		System.out.println("status : "+ stri.isEmpty());
		stri.add("kiara");
		stri.add("ved");
		stri.add("urvee");
		stri.add("shreya");
		stri.add("anika");
		System.out.println("status : "+ stri.isEmpty());
		System.out.println("size of string collection : "+ stri.size());
		System.out.println("elements of string list : "+ stri);
		 Collections.reverse(stri);
			System.out.println("reverse of string collection : "+stri);
			Collections.sort(stri);
			System.out.println("sorting of string collection : "+stri);
			System.out.println("***********************************");
			for(String o:stri) {
				System.out.println(o);
			}
			System.out.println("***********************************");
			List <String> stri1= new ArrayList();
			stri1.add("reya");
			stri1.add("joy");
			System.out.println("elements of string1 : "+ stri1);
			stri.addAll(stri1);
			System.out.println("elements of string list : "+ stri);
			stri.removeAll(stri1);
			System.out.println("elements of string list : "+ stri);
			stri1.add("shreya");
			stri1.add("anika");
			System.out.println("elements of string list : "+ stri1);
			stri.retainAll(stri1);
			System.out.println("elements of string list : "+ stri);
			stri1.remove(0);
			System.out.println("elements of string list : "+ stri1);
			stri.remove("anika");
			System.out.println("elements of string list : "+ stri);
			stri1.clear();
			System.out.println("elements of string list : "+ stri1);
			System.out.println("***********************************");
			List <String> stri2= new ArrayList();
			stri2.add("radha");
			stri2.add("ankur");
			stri2.add("anshul");
			stri2.add("parth");
			stri2.add("khushbu");
			stri2.add("jitu");
			stri2.add("kittu");
			System.out.println("elements of string 2  list : "+ stri2);
			if(stri2.contains("jitu")) {
				stri2.remove("jitu");
			}
			System.out.println("elements of string 2  list : "+ stri2);
			stri2.removeIf(a-> a.contains("kittu"));
			System.out.println("elements of string 2  list : "+ stri2);
}
}