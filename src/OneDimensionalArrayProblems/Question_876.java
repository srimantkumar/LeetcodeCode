package OneDimensionalArrayProblems;

/**
 * Definition for singly-linked list. */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Question_876 {
    ListNode head;

    public static void main(String[] args) {
        Question_876 llist = new Question_876();
        llist.push(1);
//        llist.push(2);
//        llist.push(7);
//        llist.push(4);
//        llist.push(5);

        System.out.println(llist.middleNode(llist.head).val);
    }


    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public ListNode middleNode(ListNode head) {
        if(head.next == null)
            return head;
        int count= 0;
        int midTerm;
        while (head != null) {
            count++;
            head = head.next;
        }
        head = this.head;
        midTerm = count / 2 +  1;
        count = 0;
        while (head != null) {
            count++;
            if(count != midTerm) {
                head = head.next;
                continue;
            }
            break;
        }
        return head;
    }

}
