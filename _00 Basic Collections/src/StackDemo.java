//package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s =new Stack<>();
		s.push(1);
		s.push(2);
		s.add(3); //can use push or add methods because it extends Vector class also
		s.add(4);
		s.push(5);
		System.out.println("Initial Stack "+s);
		
		System.out.println("Top "+ s.peek()); //returns the top element
		System.out.println("Pop "+ s.pop()); //removes top element
		System.out.println("Empty "+ s.empty()); //returns true if stack is empty
		//returns 1-based position(the top ele has idx 1 and next top has idx 2 and so on) if found else returns -1
		System.out.println("Search "+ s.search(3)); 
	}

}
