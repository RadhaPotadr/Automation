package day26.practice;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class Trialmap {

	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<String, Integer>();
		m.put("anshul", 5);
		m.put("khushbu", 3);
		m.put("parth", 1);
		m.put("ankur", 2);
		m.put("radha", 4);
		System.out.println("elemets in map "+m);
		System.out.println("***************************");
		for(Map.Entry<String, Integer> m1: m.entrySet()) {
			System.out.println(m1.getKey()+ "  "+m1.getValue());	
		}
		System.out.println("***************************");
       m.forEach((a,b)->{
    	   System.out.println(a+" "+b);
       });
       System.out.println("***************************");
       Iterator<Map.Entry<String, Integer>> obj= m.entrySet().iterator();
       while(obj.hasNext()) {
    	   Map.Entry<String, Integer> obj1=obj.next();
    	   System.out.println(obj1.getKey()+" "+obj1.getValue());
       }
       System.out.println("***************************");
       TreeMap <String, Integer>map = new TreeMap<String, Integer>();
       map.put("english", 86);
       map.put("chemistry", 59);
       map.put("physics", 82);
       map.put("biology", 52);
       map.put("math", 95);
       map.put("electronics", 94);
       map.put("computer", 88);
       System.out.println(map);
       System.out.println(map.containsKey("english"));
       System.out.println(map.containsValue(88));
       System.out.println(map.firstKey());
       System.out.println(map.floorKey("math"));
       System.out.println(map.lastKey());
       System.out.println(map.higherKey("electronics"));
       System.out.println(map.lastKey());
       System.out.println(map.lowerKey("chemistry"));
       System.out.println(map.descendingKeySet());
       System.out.println(map.descendingMap());
       System.out.println(map.firstEntry());
       System.out.println(map.floorEntry("math"));
       System.out.println(map.lastEntry());
       System.out.println(map.pollFirstEntry());
       System.out.println(map);
       System.out.println(map.pollLastEntry()); 
       System.out.println(map);
       System.out.println(map.putIfAbsent("physics", 82));
       System.out.println(map.putIfAbsent("biology", 52));
       System.out.println(map);
       System.out.println(map.headMap("math"));
       System.out.println(map.headMap("math", true));
       System.out.println(map.subMap("computer", "math"));
       System.out.println(map.subMap("computer", false, "math", true));
       System.out.println(map.subMap("computer", true, "math", true));
       System.out.println(map.tailMap("computer"));
       System.out.println(map.tailMap("computer", false));
       map.remove("biology");
       System.out.println("***************************");
       Iterator<Map.Entry<String, Integer>> map1=map.entrySet().iterator();
       while(map1.hasNext()) {
    	   Map.Entry<String, Integer> v=map1.next();
    	   System.out.println(v);
       }
       System.out.println("***************************");
       for (Map.Entry<String, Integer> v1:map.entrySet()) {
    	   System.out.println(v1.getKey()+" "+v1.getValue());
       }
       System.out.println("***************************");
       map.forEach((x,y)-> {
    	   System.out.println(x+" "+y);
   });
	}

}
