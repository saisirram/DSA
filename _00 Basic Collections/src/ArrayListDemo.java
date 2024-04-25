//package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        for (int i = 0; i < 5; i++) {
            ar.add(i); // add element to an Array
        }
		/*add(insert) element at particular index
		 - O(N)
		 - Inserts the element at the index and left shifts all the other ele's by one position */
        ar.add(2, 3);

        for (int x : ar) {
            System.out.println(x);
        }
        int k = ar.remove(1); //remove element from arrayList(it returns an element deleted)->it can also not be used
        System.out.println("Removed val " + k);

        System.out.println(ar); // toString method got overridden

        ar.remove(1);
        System.out.println("remove " + ar); // toString method got overridden

        //set is used to replace the ele at given idx with new ele it returns the replaced element
        System.out.println("replaced ele " + ar.set(1, 4));

        System.out.println("set " + ar);

        System.out.println("get " + ar.get(2)); // gets the ele at given idx

        // returns true if given val is present
        System.out.println("contains " + ar.contains(4));

        // returns size of Array list
        System.out.println("Size " + ar.size());

        System.out.println("IndexOf " + ar.indexOf(4)); //returns idx of given val else returns -1
        System.out.println("LastIndexOf " + ar.lastIndexOf(4)); //returns idx of last occurrence of given val else -1

        ar.addAll(ar1); // add a collection of elements
        System.out.println("AddAll " + ar);

        ar.addAll(1, ar1); // adds all element starting from an index in original arraylist
        System.out.println("AddAll idx " + ar);
//		ar.addAll(ar1);
//		ar.addAll(ar1);
//		ar.addAll(1, ar1);
//		ar.addAll(ar1);
//		System.out.println("AddAll idx "+ar);

        ar.removeAll(ar1); // removes all the occurrences of given collection
        System.out.println("RemoveAll " + ar);

        System.out.println("Sublist " + ar.subList(1, 3)); // returns a sublist in a give range of idx

        ArrayList<Integer> aclone = new ArrayList<>();
        aclone = (ArrayList<Integer>) ar.clone(); // clones arraylist as object and typecasted it to arraylist (DONOT DO IT)
        System.out.println("clone " + aclone);

        System.out.println("isEmpty " + ar.isEmpty()); //returns true if list is empty

        //traversing using list Iterator
        ListIterator<Integer> list = ar.listIterator();

        //list iteration forward manner
        while (list.hasNext()) {
            System.out.println("Fwd " + list.next());
        }

        //list iteration Backward manner
        while (list.hasPrevious()) {
            System.out.println("Bwd " + list.previous());
        }

        ar.clear();//removes all the ele from the list
        System.out.println("arrayList after clear " + ar);

        //Sorting an Array List
        ArrayList<Integer> unorderedList = new ArrayList<>(Arrays.asList(55, 32, 53, 11, 75, 2, 67, 81));

        System.out.println("Sorting");
        System.out.println("Unsorted array " + unorderedList);
        Collections.sort(unorderedList); // ascending order
        System.out.println("Ascending order sorting = " + unorderedList);
        unorderedList.sort(Collections.reverseOrder()); // or Collections.sort(unorderedList, Collections.reverseOrder())
        System.out.println("Descending order sorting = " + unorderedList);
        //many of properties are same in ArrayList LinkedList Vector

    }


}
