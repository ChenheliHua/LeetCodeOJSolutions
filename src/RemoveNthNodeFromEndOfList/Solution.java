package RemoveNthNodeFromEndOfList;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/10/2014
 */
public class Solution
{
  public ListNode removeNthFromEnd(ListNode head, int n)
  {
    if (head == null || n == 0)
    {
      return head;
    }

    int headPos = removeNthFromEndKernel(head,n);

    if (headPos == n)
    {
      return head.next;
    }
    else
    {
      return head;
    }
  }

  private int removeNthFromEndKernel(ListNode head, int n)
  {
    if (head == null)
    {
      return 0;
    }

    int prevPos = removeNthFromEndKernel(head.next,n);

    if (prevPos == n)
    {
      head.next = head.next.next;
    }

    return prevPos + 1;
  }
}
