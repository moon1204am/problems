public class MiddleOfLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        int size = 0;
        while(current != null) {
            size++;
            current = current.next;
        }
        double middle = size / 2;
        int secondNext = -1;
        if(middle % 1 != 0) {
            secondNext = (int) middle;
            secondNext += secondNext;
            middle = secondNext;
        }
        int counter = 0;
        while(counter != middle) {
            head = head.next;
            counter++;
        }
        return head;
    }
}
