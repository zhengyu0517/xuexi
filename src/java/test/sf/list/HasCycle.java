package test.sf.list;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(null == head) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if(slow==null || fast==null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
