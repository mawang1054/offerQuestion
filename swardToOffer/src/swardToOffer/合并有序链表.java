package swardToOffer;

import utils.ListNode;

public class 合并有序链表 {
	public static void main(String[] args) {
		
	}
	
    public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null && list2 == null)
			return null;
		else if(list1 == null)
			return list2;
		else if(list2 == null)
			return list1;
		ListNode root = new ListNode(1);
		ListNode next = root;
    	while(list1 != null && list2 != null) {
    		if(list1.val > list2.val) {
    			next.next = list2;
    			list2 = list2.next;
    		} else {
    			next.next = list1;
    			list1 = list1.next;
    		}
			next = next.next;
    	}
    	if(list1 == null) {
    		next.next = list2;
    	}
    	if(list2 == null) {
    		next.next = list1;
    	}
    	return root.next;
    }
}
