package LinkedListCycleII;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/9/2014
 */
public class Solution
{
  public ListNode detectCycle(ListNode head)
  {
    if (head == null)
    {
      return null;
    }

    ListNode slow = head;
    ListNode fast = head;

    do
    {
      slow = slow.next;

      fast = fast.next;

      if (fast != null)
      {
        fast = fast.next;
      }
      else
      {
        break;
      }
    }
    while (fast != null && slow != fast);

    if (fast == null)
    {
      return null;
    }

    slow = head;

    while (slow != fast)
    {
      slow = slow.next;
      fast = fast.next;
    }

    return fast;
  }
}
