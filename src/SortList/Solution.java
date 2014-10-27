package SortList;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/26/2014
 */
public class Solution
{
  public ListNode sortList(ListNode head)
  {
    if (head == null || head.next == null)
    {
      return head;
    }

    int len = 0;
    ListNode ptr = head;
    while (ptr != null)
    {
      len++;
      ptr = ptr.next;
    }

    ptr = head;
    int pos = 1;
    while (pos < len / 2)
    {
      pos++;
      ptr = ptr.next;
    }

    ListNode first = head;
    ListNode second = ptr.next;
    ptr.next = null;

    first = sortList(first);
    second = sortList(second);

    return mergeLists(first, second);
  }

  private ListNode mergeLists(ListNode first, ListNode second)
  {
    ListNode head = null;
    ListNode tail = null;

    while (first != null && second != null)
    {
      if (head == null)
      {
        if (first.val < second.val)
        {
          head = first;
          tail = first;
          first = first.next;
        }
        else
        {
          head = second;
          tail = second;
          second = second.next;
        }
      }
      else
      {
        if (first.val < second.val)
        {
          tail.next = first;
          tail = tail.next;
          first = first.next;
        }
        else
        {
          tail.next = second;
          tail = tail.next;
          second = second.next;
        }
      }
    }

    if (first != null)
    {
      tail.next = first;
    }

    if (second != null)
    {
      tail.next = second;
    }

    return head;
  }
}
