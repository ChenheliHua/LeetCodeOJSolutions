package RemoveDuplicatesFromSortedList;

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
    ListNode ptr = head;

    while (ptr != null && ptr.next != null)
    {
      if (ptr.val == ptr.next.val)
      {
        ptr.next = ptr.next.next;
      }
      else
      {
        ptr = ptr.next;
      }
    }

    return head;
  }
}
