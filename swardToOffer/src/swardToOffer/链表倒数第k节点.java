package swardToOffer;

import utils.ListNode;;

public class 链表倒数第k节点 {
	public static void main(String[] args) {
		
	}
	
	public ListNode solution(ListNode head, int k) {
		ListNode slow = head;
		ListNode fast = head;
		
		if(k <= 0) {
			return null;
		}
		
		int count = 0;
		while(fast != null) {
			if(count < k) {
				fast = fast.next;
				count++;
			} else {
				fast = fast.next;
				slow = slow.next;
			}
		}
		
		if(count == k)
			return slow;
		else
			return null;
	}
}
