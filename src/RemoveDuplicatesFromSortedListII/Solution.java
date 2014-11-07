package RemoveDuplicatesFromSortedListII;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/6/2014
 */
public class Solution
{
  public ListNode deleteDuplicates(ListNode head)
  {
    if (head == null)
    {
      return null;
    }

    ListNode dummy = new ListNode(head.val - 1);
    dummy.next = head;
    ListNode ptr = dummy;

    boolean isDup = false;

    while (ptr.next != null && ptr.next.next != null)
    {
      if (ptr.next.val == ptr.next.next.val)
      {
        isDup = true;
        ptr.next = ptr.next.next;
      }
      else
      {
        if (isDup)
        {
          ptr.next = ptr.next.next;
          isDup = false;
        }
        else
        {
          ptr = ptr.next;
        }
      }
    }

    if (isDup)
    {
      ptr.next = ptr.next.next;
    }

    return dummy.next;
  }
}
