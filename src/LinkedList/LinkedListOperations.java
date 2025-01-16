package LinkedList;

public class LinkedListOperations {
    public static Node head;

    public void addAtEnd(int data) {
        if (head ==null) {
            head = new Node(data);
            return;
        }

        Node new_node = new Node(data);
        Node last_node = head;
        while(last_node.next != null) {
            last_node = last_node.next;
        }
        last_node.next = new_node;
        if (new_node.data == 8) {
            new_node.next = head.next.next.next.next.next;
        }
    }

    public void display(Node head)
    {
        Node node = head;
        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("\b" + "\b" + "\b" + "\b");
        System.out.println();
    }

    public void operations() {
        LinkedListOperations llist = new LinkedListOperations();
        llist.addAtEnd(1);
        llist.addAtEnd(-7);
        llist.addAtEnd(7);
        llist.addAtEnd(-4);
        llist.addAtEnd(19);
        llist.addAtEnd(6);
        llist.addAtEnd(-9);
        llist.addAtEnd(-5);
        llist.addAtEnd(-2);
        llist.addAtEnd(-5);
        llist.addAtEnd(8);
        //llist.display(llist.head);
        //System.out.println(llist.head.data);
    }
}
