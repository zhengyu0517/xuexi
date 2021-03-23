package test.sf.list;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    //请判断一个链表是否为回文链表。

    public boolean isPalindrome(ListNode head) {
        List<Integer> lists = new ArrayList<>();
        ListNode node = head;
        while(null != node){
            lists.add(node.val);
            node = node.next;
        }
        int i=0;
        int j= lists.size()-1;
        while(i<j){
            if(lists.get(i).equals( lists.get(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}
