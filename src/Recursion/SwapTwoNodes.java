package Recursion;

import LinkedList.Node;

public class SwapTwoNodes {
    Node head;

    public void push(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node new_node = new Node(value);
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new_node;
    }

    void display(Node head) {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("\b\b\b\b");
        System.out.println();
    }

    public static void main(String[] args) {
        SwapTwoNodes code = new SwapTwoNodes();
        code.push(1);
        code.push(2);
        code.push(3);
        code.push(4);
//        code.push(5);
//        code.push(6);
//        code.push(7);
//        code.push(8);
        code.display(code.head);

        //code.display(code.swapPair(code.head));
//        code.display(code.reverseLinkedListIteratively(code.head));
        code.display(code.reverseLinkedListRecursively(code.head));

    }

    public Node swapPair(Node head) {
        if ((head == null) || (head.next == null))
            return head;
        Node n = head.next;
        head.next = swapPair(head.next.next);
        n.next = head;
        return n;
    }

    // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8

    public Node reverseLinkedListIteratively(Node head) {
        Node temp = head;
        Node nextNode;
        Node prevNode = null;
        while (temp != null) {
            nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }
        head = prevNode;
        return head;
    }

    public Node reverseLinkedListRecursively(Node head) {
       return recursiveSolution(head, null);
    }

    private Node recursiveSolution(Node next, Node head) {
        if (next == null)
            return head;
        Node nextNode = next.next;
        next.next = head;
        return recursiveSolution(nextNode, next);
    }


}

