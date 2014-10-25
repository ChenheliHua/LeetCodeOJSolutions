package MergeKSortedLists;

import etc.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/25/2014
 */
public class Solution
{
  public ListNode mergeKLists(List<ListNode> lists)
  {
    if (lists == null || lists.size() == 0)
    {
      return null;
    }

    PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>()
    {
      @Override
      public int compare(ListNode listNode, ListNode listNode2)
      {
        if (listNode.val > listNode2.val)
        {
          return 1;
        }
        else if (listNode.val < listNode2.val)
        {
          return -1;
        }
        else
        {
          return 0;
        }
      }
    });

    for (ListNode l : lists)
    {
      if (l != null)
      {
        heap.add(l);
      }
    }

    ListNode head = null;
    ListNode tail = null;

    while (!heap.isEmpty())
    {
      ListNode top = heap.poll();

      if (head == null)
      {
        head = top;
        tail = top;
      }
      else
      {
        tail.next = top;
        tail = tail.next;
      }

      if (top.next != null)
      {
        heap.add(top.next);
      }
    }

    return head;
  }
}
