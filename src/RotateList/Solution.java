package RotateList;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/2/2014
 */
public class Solution
{
  public ListNode rotateRight(ListNode head, int n)
  {
    if (head == null || n == 0)
    {
      return head;
    }

    ListNode ptr = head;
    int length = 1;

    while (ptr.next != null)
    {
      ptr = ptr.next;
      length++;
    }

    ListNode curr = head;
    ListNode prev = ptr;
    prev.next = curr;

    int offset = length - n % length;

    for (int i = 0; i < offset; i++)
    {
      curr = curr.next;
      prev = prev.next;
    }

    prev.next = null;
    return curr;
  }
}
