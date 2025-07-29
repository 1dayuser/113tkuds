class ListNode {
    int data;
    ListNode next;
    
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    
    public static void printList(ListNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printList(head.next);
    }
    
    public static int getLength(ListNode head) {
        if (head == null) {
            return 0;
        }
        return 1 + getLength(head.next);
    }
    
    public static boolean search(ListNode head, int target) {
        if (head == null) {
            return false;
        }
        if (head.data == target) {
            return true;
        }
        return search(head.next, target);
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        
        System.out.print("串列內容: ");
        printList(head); 
        System.out.println();
        
        System.out.println("串列長度: " + getLength(head)); 
        System.out.println("搜尋 3: " + search(head, 3));   
        System.out.println("搜尋 5: " + search(head, 5));   
    }
}

