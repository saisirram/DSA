//package collections;
import java.util.*;
//import java.util.stream.*;

public class SetDemo {

	public static void main(String[] args) {
		
		// HashSet (UNSORTED UNORDERED)
		HashSet<Integer> hs = new HashSet<>();
		System.out.println();
		System.out.println("----------------HashSet Demo----------------");
		System.out.println();
		
		//adding elements
		System.out.println("adding 1 "+hs.add(1)); // returns true if it is first occurrence of ele else return false
		hs.add(2);
		System.out.println("adding 1 "+hs.add(1)); //returns false here
		hs.add(3);
		hs.add(3);
		System.out.println("Initial HashSet "+hs);
		
		//basic functions
		System.out.println("Size: "+hs.size());
		System.out.println("contains: "+hs.contains(3));
		System.out.println("isEmpty: "+hs.isEmpty());
		System.out.println("hash code: "+hs.hashCode());
		
		//iterating
        for (Integer h : hs) {
            System.out.println("X: " + h);
        }
		
		//removing
		hs.remove(2);
		System.out.println("after removing: "+ hs);

		//LinkedHashSet (UNSORTED PRESERVES ORDER)
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		System.out.println();
		System.out.println("-------------LinkedHashSet Demo-------------");
		System.out.println();
		
		//adding elements
		System.out.println("adding 1 "+lhs.add(1)); // returns true if it is first occurrence of ele else return false
		lhs.add(2);
		System.out.println("adding 1 "+lhs.add(1)); //returns false here
		lhs.add(3);
		lhs.add(3);
		System.out.println("Initial LinkedHashSet "+lhs);
		
		//basic functions
		System.out.println("Size: "+lhs.size());
		System.out.println("contains: "+lhs.contains(3));
		System.out.println("isEmpty: "+ lhs.isEmpty());
		System.out.println("hash code: "+lhs.hashCode());
		
		//iterating
        for (Integer lh : lhs) {
            System.out.println("X: " + lh);
        }
		
		//removing
		lhs.remove(2);
		System.out.println("after removing: "+ lhs);
		
		//TreeSet (SORTED SET)
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder()); // descending order
		System.out.println();
		System.out.println("----------------TreeSet Demo----------------");
		System.out.println();
		
		//adding elements
		ts.add(5);
		ts.add(2);
		ts.add(3);
		//ts.add(4);
		ts.add(1);
		ts.add(6);
		ts.add(2);
		
		System.out.println("Initial TreeSet "+ts);
		
		//basic functions
		System.out.println("Size: "+ts.size());
		System.out.println("contains: "+ts.contains(3));
		System.out.println("isEmpty: "+ts.isEmpty());
		System.out.println("hash code: "+ts.hashCode());
		
		//iterating
        for (int x : ts) {
            if (x > 2)
                System.out.println("X: " + x);
        }
		NavigableSet<Integer> ss = (NavigableSet<Integer>) ts.headSet(3);
		System.out.println("SortedSet "+ss);
		ArrayList<Integer> ar =new ArrayList<>(ts);
		ar.add(1);
		System.out.println("set ArrayList " + ar);
		
		TreeSet<Integer> ats = new TreeSet<Integer>(ar);
		Collections.reverseOrder();
		//removing
		System.out.println(" ArrayList to Set " + ats);
		ts.remove(2);
		System.out.println("after removing: "+ ts);
		
		//headSet and tailSet
		//returns SortedSet with values "<" give value if 2nd arg is true it means include the element also
		SortedSet<Integer> s = ts.headSet(3,true); 
		System.out.println("Lower set values "+s);
		//returns SortedSet with values ">=" give value if 2nd arg is false it means neglect the element also
		SortedSet<Integer> s1 = ts.tailSet(3,false);
		System.out.println("Higher set values "+s1);
		
		//first and last elements
		System.out.println("First "+ts.first()); //returns first element of set
		System.out.println("Last "+ts.last()); //returns last element of set 
		
		//floor ceiling
		System.out.println("Floor "+ts.floor(4)); //returns largest element "<=" given element else null
		System.out.println("Ceiling "+ts.ceiling(4)); //returns least  element ">=" given element else null
		
		//pollFirst && pollLast
		System.out.println("pollFirst "+ts.pollFirst()); //removes and returns the first element of set
		System.out.println("After pollFirst "+ts);
		System.out.println("pollLast "+ts.pollLast()); //removes and returns the last element of set
		System.out.println("After pollLast "+ts);
	}

}
