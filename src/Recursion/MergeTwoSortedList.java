package Recursion;

import LinkedList.LinkedListOperations;
import LinkedList.Node;

public class MergeTwoSortedList {
    public static void main(String[] args) {

    }

    public static Node mergeTwoListsNonRecursive(Node list1, Node list2) {
        Node dummy = new Node(); // Dummy node to start the merged list
        Node current = dummy; // Pointer to traverse the merged list

        // Traverse both lists and compare nodes to merge them
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next; // Move current pointer to the next node
        }

        // Append remaining nodes of list1 or list2, if any
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        return dummy.next;
    }

    public static Node mergeTwoListsRecursive(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.data < list2.data) {
            list1.next = mergeTwoListsRecursive(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeTwoListsRecursive(list1, list2.next);
            return list2;
        }
    }
}
