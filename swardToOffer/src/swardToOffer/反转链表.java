package swardToOffer;

import utils.ListNode;

public class ·´×ªÁ´±í {
	public static void main(String[] args) {
		
	}
	
	public ListNode solution(ListNode head) {
		if(head == null)
			return null;
		if(head.next == null)
			return head;
		ListNode temp = null;
		ListNode pre = head;
		ListNode aft = head.next;
		pre.next = null;
		
		while(aft != null) {
			temp = aft.next;
			aft.next = pre;
			pre = aft;
			aft = temp;
		}
		return pre;
	}
}
