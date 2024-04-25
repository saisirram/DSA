//package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
	
	public static void main(String[] args) {

		//HashMap (UNSORTED)
		HashMap<Integer,String> hm = new HashMap<>();
		
		//adding key value pairs
		hm.put(4, "s");
		hm.put(2, "a");
		hm.put(3, "c");
		hm.put(1, "b");
		System.out.println("Initial "+hm); // o/p Initial {1=b, 2=a, 3=c, 4=s}
		//basic Functions
		System.out.println("Size "+ hm.size());
		System.out.println("Get "+hm.get(1));
		System.out.println("Contains Key "+ hm.containsKey(2));
		System.out.println("Contains Value "+ hm.containsValue("b"));
		
		System.out.println("Key Set "+hm.keySet()); //returns set of keys
		System.out.println("Values Set "+ hm.values()); //returns set of values
		
		System.out.println("Removes "+hm.remove(4));
		System.out.println("After removing "+hm);
		
		System.out.println("Replace "+hm.replace(2, "n"));
		System.out.println("After replace "+hm);
		System.out.println("Replace 2 "+hm.replace(2, "n", "a"));// replaces oldval(1starg) with newval(2ndarg)
		System.out.println("After replace2 "+hm);
		
		System.out.println("Compute "+ hm.compute(2, (key,value)->"N")); //another way to update using lambda fun
		System.out.println("After Compute "+hm);
		
		System.out.println(hm.entrySet());
		
		//LinkedHashMap (UNSORTED & PRESERVES THE ORDER)
		LinkedHashMap<Integer , String> lhm = new LinkedHashMap<>();
		
		//adding elements
		lhm.put(4, "s1");
		lhm.put(2, "a1");
		lhm.put(3, "c1");
		lhm.put(1, "b1");
		
		System.out.println("Initial "+lhm); // o/p Initial {4=s1, 2=a1, 3=c1, 1=b1}
		
		//basic Functions
		System.out.println("Size "+ lhm.size());
		System.out.println("Get "+lhm.get(1));
		System.out.println("Contains Key "+ lhm.containsKey(2));
		System.out.println("Contains Value "+lhm.containsValue("b"));
		
		//all the other functions are same as HashMap

		//TreeMap (SORTED)
		TreeMap<Integer,String> tm = new TreeMap<>();
		
		tm.put(3, "a");
		tm.put(2, "b");
		tm.put(4, "d");
		tm.put(1, "c");
		
		System.out.println("Initial "+ tm);
		
		//basic Functions
		System.out.println("Size "+ tm.size());
		System.out.println("Get "+tm.get(1));
		System.out.println("Contains Key "+ tm.containsKey(2));
		System.out.println("Contains Value "+ tm.containsValue("b"));
		Entry<Integer, String > e = tm.lastEntry(); // returns last entered value
		System.out.println("lastEntry key: "+e.getKey()+ " lastEntry value: "+e.getValue());
		
		System.out.println("Equals "+ e.getValue().equals("d")); // equality check
		
		System.out.println("celing key "+tm.ceilingKey(3)); //returns least >= to given key else null
		
		//it has methods like pollFirstEntry || firstEntry || remove || replace || headMap,tailMap || higherKey and so on ......

        for (Entry<Integer, String> me : tm.entrySet()) {
            if (me.getKey() < 3) {
                me.setValue("Updated");
            }
            System.out.println("Key : " + me.getKey() + " Value : " + me.getValue());
        }
		
		
	}

}
