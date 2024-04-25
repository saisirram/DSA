//package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.ensureCapacity(20); //creating min capacity of vector
		System.out.println("Capacity: "+v.capacity()); //returns current capacity of vector
		//adding elements
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(3,4);
		
		System.out.println("Inital vector: " +v);
		
		System.out.println("contains: "+v.contains(4)); // returns true if given val is present
		
        System.out.println("Size: "+v.size()); // returns size of Array list
		
		System.out.println("IndexOf: "+v.indexOf(4)); //returns idx of given val else returns -1
		System.out.println("LastIndexOf: "+v.lastIndexOf(4)); //returns idx of last occurrence of given val else -1
		
		//many of properties are same in ArrayList LinkedList Vector
	}

}
