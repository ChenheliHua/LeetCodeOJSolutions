package IntersectionOfTwoLinkedLists;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/27/2014
 */
public class Solution
{
  public ListNode getIntersectionNode(ListNode headA, ListNode headB)
  {
    if (headA == null || headB == null)
    {
      return null;
    }

    ListNode last = null;

    ListNode ptr = headA;
    int lenA = 1;

    while (ptr.next != null)
    {
      lenA++;
      ptr = ptr.next;
    }

    last = ptr;

    ptr = headB;
    int lenB = 1;

    while (ptr.next != null)
    {
      lenB++;
      ptr = ptr.next;
    }

    if (ptr != last)
    {
      return null;
    }
    else
    {
      ListNode ptr2;

      if (lenA > lenB)
      {
        ptr = headA;
        ptr2 = headB;

        for (int i = 0; i < lenA - lenB; i++)
        {
          ptr = ptr.next;
        }
      }
      else
      {
        ptr = headB;
        ptr2 = headA;

        for (int i = 0; i < lenB - lenA; i++)
        {
          ptr = ptr.next;
        }
      }

      while (ptr != ptr2)
      {
        ptr = ptr.next;
        ptr2 = ptr2.next;
      }

      return ptr;
    }
  }
}
