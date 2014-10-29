package ReverseLinkedListII;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public ListNode reverseBetween(ListNode head, int m, int n)
  {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    int pos = 0;
    ListNode ptr = dummy;

    ListNode beforeM = null;
    ListNode afterN = null;

    while (ptr != null)
    {
      if (pos == m - 1)
      {
        beforeM = ptr;
      }

      if (pos == n)
      {
        afterN = ptr.next;
      }

      ptr = ptr.next;
      pos++;
    }

    beforeM.next = reverseList(beforeM.next, afterN);

    return dummy.next;
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
