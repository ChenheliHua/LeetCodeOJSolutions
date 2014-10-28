package ReverseNodesInKGroup;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public ListNode reverseKGroup(ListNode head, int k)
  {
    ListNode ptr = head;

    for (int i = 0; i < k; i++)
    {
      if (ptr == null)
      {
        return head;
      }

      ptr = ptr.next;
    }

    ListNode newHead = reverseList(head, ptr);
    head.next = reverseKGroup(ptr, k);

    return newHead;
  }

  private ListNode reverseList(ListNode head, ListNode end)
  {
    ListNode reversed = end;

    ListNode ptr;
    while (head != end)
    {
      ptr = head.next;
      head.next = reversed;
      reversed = head;
      head = ptr;
    }

    return reversed;
  }
}
