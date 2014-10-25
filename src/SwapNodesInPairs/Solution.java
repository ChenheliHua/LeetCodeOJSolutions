package SwapNodesInPairs;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/25/2014
 */
public class Solution
{
  public ListNode swapPairs(ListNode n)
  {
    if (n == null || n.next == null)
    {
      return n;
    }

    ListNode ptr = n.next;
    n.next = swapPairs(n.next.next);
    ptr.next = n;

    return ptr;
  }
}
