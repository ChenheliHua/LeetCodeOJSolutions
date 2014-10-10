package CopyListWithRandomPointer;

import etc.RandomListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/9/2014
 */
public class Solution
{
  public RandomListNode copyRandomList(RandomListNode head)
  {
    RandomListNode ptr = head;

    while (ptr != null)
    {
      RandomListNode newNode = new RandomListNode(ptr.label);
      newNode.next = ptr.next;
      ptr.next = newNode;
      ptr = ptr.next.next;
    }

    ptr = head;

    while (ptr != null)
    {
      if (ptr.random != null)
      {
        ptr.next.random = ptr.random.next;
      }
      else
      {
        ptr.next.random = null;
      }

      ptr = ptr.next.next;
    }

    ptr = head;

    RandomListNode newHead = null;
    RandomListNode newTail = null;

    while (ptr != null)
    {
      if (newHead == null)
      {
        newHead = ptr.next;
        newTail = ptr.next;
      }
      else
      {
        newTail.next = ptr.next;
        newTail = newTail.next;
      }

      ptr.next = ptr.next.next;
      ptr = ptr.next;
      newTail.next = null;
    }

    return newHead;
  }
}
