package test.sf.list;

public class GetIntersectionNode {
    //找到两个单链表相交的起始节点
    //1.遍历headB,headA是否在里面
    //2.hashmap,把headA节点写hashmap,遍历headB看key是否已存在
    //3.双指针  双指针走过的路径长度是一样的，会在两个链表相交的位置相遇
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA == null || headB == null) return null;
            ListNode pA = headA;
            ListNode pB = headB;
            while(pA != pB){
                pA = pA == null? headB: pA.next;
                pB = pB == null? headA: pB.next;
            }
            return pA;
        }
}
