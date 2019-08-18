package 链表;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import utils.ListNode;

public class 合并K个排序链表 {
	public static void main(String[] args) {
		
	}
	
    public ListNode mergeKLists(ListNode[] lists) {
    	ListNode head = new ListNode(0);
    	ListNode next = head;
    	
    	Queue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		});
    	
    	for(int i = 0; i < lists.length; i++) {
    		if(lists[i] != null) {
    			queue.add(lists[i]);
    		}
    	}
    	
    	while(!queue.isEmpty()) {
    		ListNode temp = queue.poll();
    		next.next = temp;
    		next = next.next;
    		if(temp.next != null) {
    			queue.add(temp.next);
    		}
    	}
    	
    	return head.next;
    }
}
