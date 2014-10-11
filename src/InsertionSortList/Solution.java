package InsertionSortList;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/10/2014
 */
public class Solution
{
  public ListNode insertionSortList(ListNode head)
  {
    if (head == null)
    {
      return head;
    }

    ListNode dummy = new ListNode(Integer.MIN_VALUE);
    dummy.next = head;

    insertionSortListKernel(dummy, Integer.MIN_VALUE);

    return dummy.next;
  }

  private ListNode insertionSortListKernel(ListNode head, int prev)
  {
    if (head == null)
    {
      return null;
    }

    if (prev > head.val)
    {
      return head;
    }

    ListNode recur;

    while ((recur = insertionSortListKernel(head.next, head.val)) != null)
    {
      if (recur.val < head.val)
      {
        head.next = recur.next;
        recur.next = head;

        return recur;
      }
      else
      {
        head.next = recur;
      }
    }

    return null;
  }
}
