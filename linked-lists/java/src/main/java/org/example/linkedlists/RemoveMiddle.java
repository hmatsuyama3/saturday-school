package org.example.linkedlists;

public class RemoveMiddle {
    public static void remove(LinkedListNode<Integer> node) {
        node.getPrevious().setNext(node.getNext());
    }
}
