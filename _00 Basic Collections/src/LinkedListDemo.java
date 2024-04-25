//package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<>();
		
		//add
		li.add(0, 1);
		li.add(2);
		li.add(1,3);
		li.add(4);
		System.out.println(li);
		
		System.out.println("contains "+li.contains(4)); // returns true if given val is present
		
        System.out.println("Size "+li.size()); // returns size of Array list
		
		System.out.println("IndexOf "+li.indexOf(4)); //returns idx of given val else returns -1
		System.out.println("LastIndexOf "+li.lastIndexOf(4)); //returns idx of last occurrence of given val else -1
		
		li.addFirst(5); //adds ele at the beginning of the linked list - throws an exception
		System.out.println("Begining "+li);
		
		li.addLast(5); //adds ele at the ending of the linked list - throws an exception
		System.out.println("Begining "+li);
		
		System.out.println("replaced ele "+li.set(1, 0));//set is used to replace the ele at given idx with new ele it returns the replaced element
		System.out.println("set "+li);
		
		//get
		System.out.println("get "+li.get(2)); // gets the element at given idx
		System.out.println("get first "+li.getFirst()); // gets the  first element
		System.out.println("get last "+li.getLast()); // gets the  first element
		
		//remove
		li.removeFirstOccurrence(5);// removes first occurrence 
		System.out.println("remove first occ "+li);
		li.removeLastOccurrence(5);// removes last occurrence 
		System.out.println("remove last occ "+li);
		li.removeFirst(); // removes first element 
		System.out.println("remove first ele "+li);
		li.removeLast(); // removes first element 
		System.out.println("remove last ele "+li);
		li.remove(1); // removes an element at a specific index
		System.out.println("remove obj "+ li);
		
		//addAll
		LinkedList<Integer> li1 = new LinkedList<>();
		li1.add(0,0);
		li1.add(1,1);
		li1.add(2,2);
		System.out.println("new linkedlist "+li1);
		li.addAll(0,li1);//add all element in the collection
		System.out.println("new added linkedlist "+li);
		
		//peek
		System.out.println("peek "+ li.peek()); //returns head val of the list else null if empty
		System.out.println("peek first "+ li.peekFirst()); //returns first val of the list else null if empty
		System.out.println("peek last "+ li.peekLast()); //returns last val of the list else null if empty
		
		System.out.println("list before poll "+li);
		
		//poll
		System.out.println("poll "+ li.poll()); //returns  and removes head val of the list else null if empty
		System.out.println("poll first "+ li.pollFirst()); //returns and removes  first val of the list else null if empty
		System.out.println("poll last "+ li.pollLast()); //returns removes last val of the list else null if empty
		
		System.out.println("list after poll "+li);
		
		System.out.println("isEmpty "+ li.isEmpty()); //returns true if list is empty
		
		li.clear();//removes all the ele from the list
		System.out.println("linkedList after clear "+li);
		
		//many of properties are same in ArrayList LinkedList Vector

	}

}
