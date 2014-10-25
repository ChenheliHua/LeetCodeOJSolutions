package ReorderList;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/25/2014
 */
public class Solution
{
  public void reorderList(ListNode head)
  {
    if (head == null)
    {
      return;
    }

    int len = 0;
    ListNode ptr = head;

    while (ptr != null)
    {
      len++;
      ptr = ptr.next;
    }

    ptr = head;
    for (int i = 0; i < len / 2; i++)
    {
      ptr = ptr.next;
    }
    ListNode half = ptr.next;
    ptr.next = null;

    ListNode reversedHalf = reverse(half);

    mergeLists(head, reversedHalf);
  }

  private ListNode reverse(ListNode head)
  {
    ListNode reversed = null;
    ListNode ptr;

    while (head != null)
    {
      ptr = head.next;
      head.next = reversed;
      reversed = head;
      head = ptr;
    }

    return reversed;
  }

  private void mergeLists(ListNode h1, ListNode h2)
  {
    ListNode ptr;

    while (h2 != null)
    {
      ptr = h1.next;
      h1.next = h2;
      h2 = h2.next;
      h1.next.next = ptr;
      h1 = ptr;
    }
  }
}
