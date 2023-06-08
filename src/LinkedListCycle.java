import java.util.HashSet;

public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedListCycle obj = new LinkedListCycle();
        ListNode head = new ListNode(-1);
        head.next = new ListNode(-7);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = new ListNode(19);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(-9);
        head.next.next.next.next.next.next.next = new ListNode(-5);
        head.next.next.next.next.next.next.next.next = new ListNode(-2);
        head.next.next.next.next.next.next.next.next.next = new ListNode(-5);

        obj.detectCycle(head);
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        } else if(head.next == head || head.next.next == head) {
            return head;
        }

        ListNode current = head;

        HashSet<ListNode> nodes = new HashSet<>();
        while(current != null) {
            if(nodes.contains(current)) {
                return current;
            }
            nodes.add(current);
            current = current.next;
        }
        return null;
    }
}
