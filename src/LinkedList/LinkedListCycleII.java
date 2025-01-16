package LinkedList;

import java.util.*;

public class LinkedListCycleII {
    public static void main(String[] args) {
        LinkedListOperations sllist = new LinkedListOperations();
        sllist.operations();
        detectCycle(LinkedListOperations.head);
    }

    static Node detectCycle(Node head) {
        Set<Integer> hash = new HashSet<>();
        Node slow_p = head;
        while (slow_p != null) {
            if (hash.contains(slow_p.data) && hash.contains(slow_p.next.data)) {
                System.out.println(slow_p.data);
                return slow_p;
            }
            hash.add(slow_p.data);
            //System.out.println(hash);
            slow_p = slow_p.next;
        }
        return null;
    }
}
