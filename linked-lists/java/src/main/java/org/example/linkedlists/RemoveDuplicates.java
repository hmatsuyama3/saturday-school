package org.example.linkedlists;


import java.util.HashSet;

public class RemoveDuplicates {
//this uses a buffer.
    public static void remove(LinkedListNode<Integer> node) {
        HashSet<Integer> set = new HashSet<>(); //store the values that are encountered
        LinkedListNode<Integer> previous = null;
        while(node != null){
            if(set.contains(node.getElement())){ //if a node that has a duplicate element is encountered
                previous.setNext(node.getNext()); //remove the element by setting node.next to the one after.
            }else{
                set.add(node.getElement()); //otherwise, add the value to the hashset
                previous = node;            //keep the element in the linked list.
            }
            node=node.getNext();
        }

    }
}