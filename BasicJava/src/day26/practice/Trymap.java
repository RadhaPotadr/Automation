package day26.practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Iterator;
public class Trymap {
	public static void main(String[] args) {
		Map m1= new HashMap();
		m1.put(1, null);
		m1.put(4, 'e');
		m1.put(5, "kiara");
		m1.put(6, 23);
		m1.put(2, true);
		m1.put(3, 5.09f);
		System.out.println(m1);
		m1.forEach((obj, obj1) -> {
		    System.out.println("Key : " + obj + " ,  Value : " + obj1);
		});
		System.out.println("****************************************");
		 System.out.println(m1.entrySet()); 
		 System.out.println( m1.containsKey(3));
		 System.out.println( m1.keySet());
		 System.out.println( m1.size());
		 System.out.println( m1.containsValue('e'));
		 System.out.println( m1.put(1, "mihir"));
		 System.out.println(m1);
		 System.out.println( m1.putIfAbsent(7, 45));
		 System.out.println(m1);
		 System.out.println( m1.remove(4));
		 System.out.println(m1);
		 System.out.println( m1.remove(1, "mihir"));
		 System.out.println(m1);
		 System.out.println( m1.replace(2, false));
		 System.out.println(m1);
		 System.out.println( m1.replace(3,5.09f , 7.90f));
		 System.out.println(m1);
		System.out.println("****************************************");
		 Map<Integer, String> m2= new HashMap<Integer, String>();
		 m2.put(11, "radha");
		 m2.put(7, "kripa");
		 m2.put(3, "sunita");
		 m2.put(9, "anamika");
		 m2.put(13, "sandeep");
		 Map<Integer, String> m3= new HashMap<Integer, String>();
		 m3.put(10, "radha");
		 m3.put(14, "vihan");
		 m3.put(91, "karuna");
		 m3.put(1, "aasha");
		 System.out.println(m2.size());
		 System.out.println(m3.size());
		 System.out.println(m2);
		 System.out.println(m3);
		 m2.putAll(m3);
		 System.out.println(m2.size());
		 System.out.println(m2);
		 m2.forEach((key,value)->{
			 System.out.println("key : "+ key+" , value: "+ value);
		 });
		 System.out.println("****************************************");
		 for(Map.Entry<Integer, String> m: m2.entrySet()) {
			 System.out.println(m.getKey()+" "+m.getValue());
		 }
		 System.out.println("****************************************");
		  Iterator<Map.Entry<Integer, String>> it = m2.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry<Integer, String> entry = it.next();
		        System.out.println(entry.getKey() + ":" + entry.getValue());
		    }
		}
	}


