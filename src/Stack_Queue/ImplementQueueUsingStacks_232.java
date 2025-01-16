package Stack_Queue;


import LinkedList.Node;

public class ImplementQueueUsingStacks_232 {
    static Node head;

    public static void main(String[] args) {
        ImplementQueueUsingStacks_232 queue = new ImplementQueueUsingStacks_232();
        queue.push(10);
        queue.push(20);
        queue.display(head);
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.empty());
    }


    public void push(int x) {
        if (head ==null) {
            head = new Node(x);
            return;
        }

        Node new_node = new Node(x);
        Node last_node = head;
        while(last_node.next != null) {
            last_node = last_node.next;
        }
        last_node.next = new_node;
    }

    public int pop() {
        int val = head.data;
        head = head.next;
        return val;
    }

    public int peek() {
        int val = head.data;
        return val;
    }

    public boolean empty() {
        if (head == null)
            return true;
        else
            return false;
    }

    void display(Node head)
    {
        Node node = head;
        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("\b" + "\b" + "\b" + "\b");
        System.out.println();
    }
}
