package Recursion;

import LinkedList.LinkedListOperations;
import LinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListOperations operations = new LinkedListOperations();
        operations.addAtEnd(1);
        operations.addAtEnd(2);
        operations.addAtEnd(3);
        operations.addAtEnd(4);
        operations.addAtEnd(5);
        new ReverseLinkedList();
        operations.display(LinkedListOperations.head);
    }

    public ReverseLinkedList() {
        Node nextNode;
        Node prevNode = null;
        Node temp = LinkedListOperations.head;
        while (temp != null) {
            nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }
        LinkedListOperations.head = prevNode;
    }
}
