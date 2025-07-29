class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListUtils {

    public static void printReverse(ListNode head) {
        if (head == null) {
            return;
        }
        printReverse(head.next);      
        System.out.print(head.val + " ");  
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("反向列印結果: ");
        printReverse(head);  
    }
}
