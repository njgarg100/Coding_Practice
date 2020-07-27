package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPractice {
    
	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode head1 = l1;
		ListNode head2 = l2;
		int i = 0;
		int c = 1;
		int e = 2;
		while(i<5) {
			l1.val = c;
			l2.val = e;
			c=c+2;
			e=e+2;
			l1.next = new ListNode(0);
			l1 = l1.next;
			l2.next = new ListNode(0);
			l2 = l2.next;
			i++;
		}
		l1.next = null;
		l2.next = null;
		ListNode cur1 = head1;
		ListNode cur2 = head2;
		while(cur1!=null)
		{
			System.out.println(cur1.val);
			System.out.println(cur2.val);
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
		System.out.println(cur1.val);
		cur1 = new ListNode(9);
		System.out.println(cur1.val);
	}
}

