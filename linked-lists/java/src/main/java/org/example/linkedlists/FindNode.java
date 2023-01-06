package org.example.linkedlists;

public class FindNode {

    /*
     * Consider the algorithm efficiency:
     *   - Does it use recursion or does it iterate?
     *   - What is the time complexity?
     *
     * @param nth - The number of nodes from the end. A 0 value would be the last node, and 3 would be second to last.
     * @param head - The head node of the LinkedList
     * @return The node at nth away from the end.
     */
    public static LinkedListNode<Integer> findNthFromEnd(int nth, LinkedListNode<Integer> head) {
        int size = 0;
        LinkedListNode<Integer> counter = head; //have to send in a node object to iterate through linked list
        while(counter != null){ //use it to find out how long the linked list is
            size++;
            counter=counter.getNext();
        }

        int location = size-nth-1; //the nth from the end is length-nth-1 to account for zero index
        if(location<0){             //handle edge case - if nth is larger than linked list size, return null
            return null;
        }else{
            for(int i=0; i<location; i++){ //iterate through linked list & return head at the correct element
                head = head.getNext();
            }
            return head;
        }

    }
}
