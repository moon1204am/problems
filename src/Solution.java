/*class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        }

        ListNode result = new ListNode();
        ListNode current;
        ListNode previous;

        if(list1.val <= list2.val) {
            result = list1;
            previous = list1;
            list1 = list1.next;
            current = list1;
        } else {
            result = list2;
            previous = list2;
            list2 = list2.next;
            current = list2;
        }

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                list1 = list1.next;
                current.next = list2;
            } else if(list1.val > list2.val) {
                previous = list2.next;
                list2.next = current;
                list2 = list2.next;
            } else {
                //node.next = list1;
                /node = node.next;
                if(node == list2) {
                    node.next = list1;
                    //node = node.next;
                } else if(node == list1) {
                    list1 = list1.next;
                    node.next = list2;
                }

                //node = node.next;
                //node = node.next;
                list2 = list2.next;
            }
        }

        if(list1.next == null) {
            list1.next = list2;
        } else if(list2.next == null) {
            list2.next = list1;
        }



        return result;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}*/