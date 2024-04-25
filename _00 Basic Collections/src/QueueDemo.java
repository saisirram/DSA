//package collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>(); //can also use PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1); //adds element can also use offer() function
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Initial Queue " + q);
        System.out.println("peek " + q.peek()); //returns first(head) element or element() also do same thing
        System.out.println("remove " + q.remove());//removes first(head) element or POLL also do the same thing

        q.offer(29); // adds the element to the last
        // always prefer Offer related methods like offer(), offerFirst(), offerLast() over push
        // because they return true or false or null value instead of throwing exception

        Queue<Integer> pq = new PriorityQueue<>(); // min priority Queue
        pq.offer(10);
        pq.offer(0);
        pq.offer(8);
        pq.offer(7);
        pq.offer(9);

        System.out.println("Initial Priority Queue" + pq);
        /*
         * Output: Initial Priority Queue[0, 8, 7, 10, 9]
         * here the whole Queue is not sorted, juts the min element is coming to the first of the Queue
         * the elements in the Priority Queue is ordered based on the min Priority Queue(Min Heap)
         * */

        System.out.println("First element in the Queue: "+ pq.poll());
        System.out.println("Queue after removal of first element: " + pq);

        Queue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder()); // max priority queue
        maxpq.offer(9);
        maxpq.offer(6);
        maxpq.offer(56);
        maxpq.offer(3);
        maxpq.offer(11);

        System.out.println("Initial Max Priority Queue " + maxpq);

        /*
        * Initial Max Priority Queue[56, 11, 9, 3, 6]
        * only the max element will come to first of the queue
        * this uses max heap principle
        * */

        System.out.println("First element in the Queue: "+ maxpq.poll());
        System.out.println("Queue after removal of first element: " + maxpq);
    }

}
