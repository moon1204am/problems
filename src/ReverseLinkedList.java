public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ReverseLinkedList obj = new ReverseLinkedList();

        ListNode current = node;
        while(current != null) {
            System.out.println(current.val);
            current = current.next;
        }
        System.out.println("reversing");
        ListNode reversed = obj.reverseList(node);
        System.out.println("printing reversed");
        while(reversed != null) {
            System.out.println(reversed.val);
            reversed = reversed.next;
        }

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        } else if(head.next.next == null) {
            ListNode last = head.next;
            last.next = head;
            head.next = null;
            return last;
        }

        ListNode previous = head;
        ListNode current = head.next;
        head = head.next.next;

        previous.next = null;
        while(head != null) {
            current.next = previous;
            previous = current;
            current = head;
            head = head.next;
        }
        current.next = previous;
        return current;
    }
}



