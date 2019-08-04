package swardToOffer;

import utils.ListNode;

public class 链表环的入口节点 {
	public static void main(String[] args) {
		
	}
	
	public ListNode solution1(ListNode pHead) {
		ListNode fast = pHead;
		ListNode slow = pHead;
		
		boolean flag = false;
		int count = 1;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				flag = true;	
				break;
			}

		}
		
		if(flag) {
			fast = fast.next;
			while(slow != fast) {
				fast = fast.next;
				count++;
			}
			slow = pHead;
			fast = pHead;
			for(int i = 0; i < count; i++) {
				fast = fast.next;
			}
			while(slow != fast) {
				fast = fast.next;
				slow = slow.next;
			}
			return slow;
		} else {
			return null;			
		}
	}
	
	public ListNode solution2(ListNode pHead) {
        ListNode fastNode = pHead;
        ListNode slowNode = pHead;
        boolean flag = false;
        while(fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode) {
                flag = true;
                break;
            }
 
        }
        if(flag) {
            slowNode = pHead;
            while(fastNode != slowNode) {
                fastNode = fastNode.next;
                slowNode = slowNode.next;
            }
            return slowNode;
        } else {
            return null;
        }
	}
}
