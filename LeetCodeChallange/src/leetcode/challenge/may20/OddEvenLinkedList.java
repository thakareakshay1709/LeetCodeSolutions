package leetcode.challenge.may20;

public class OddEvenLinkedList 
{
	public ListNode oddEvenList(ListNode head) 
	{
		 if(head == null) {return head;} 
		 ListNode output = head;
		 ListNode pointer1 = head;
		 ListNode pointer2 = head.next;
		 ListNode join = head.next;
		 while(pointer1 != null && pointer2 != null)
		 {
			 ListNode temp = pointer2.next;
			 if(temp == null) {break;}
			 pointer1.next = pointer2.next;
			 pointer1 = pointer1.next;	 
			 pointer2.next = pointer1.next;
			 pointer2 = pointer2.next;
		 }
		 pointer1.next = join;
		 return output;
    }
}
