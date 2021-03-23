package test.sf.list;

public class MergeTwoLists {
    //合并两个有序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         if(l1 == null) return l2;
         if(l2 == null) return l1;
         if(l1==null && l2== null) return null;
         ListNode pC;
         ListNode pA = l1;
         ListNode pB = l2;
         while(pA !=null){
             if(pA.val<pB.val){

             }

         }
         return null;
    }
}
