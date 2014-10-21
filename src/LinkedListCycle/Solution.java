package LinkedListCycle;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/20/2014
 */
public class Solution
{
  public boolean hasCycle(ListNode head)
  {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null)
    {
      slow = slow.next;
      fast = fast.next;

      if (fast != null)
      {
        fast = fast.next;
      }
      else
      {
        return false;
      }

      if (slow == fast)
      {
        return true;
      }
    }

    return false;
  }
}
