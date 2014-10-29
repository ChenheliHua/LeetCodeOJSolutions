package AddTwoNumbers;

import etc.ListNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/29/2014
 */
public class Solution
{
  public ListNode addTwoNumbers(ListNode l1, ListNode l2)
  {
    return addTwoNumbersKernel(l1, l2, 0);
  }

  private ListNode addTwoNumbersKernel(ListNode l1, ListNode l2, int carry)
  {
    if (l1 != null && l2 != null)
    {
      int val = l1.val + l2.val + carry;
      ListNode curr = new ListNode(val % 10);
      curr.next = addTwoNumbersKernel(l1.next, l2.next, val / 10);

      return curr;
    }
    else if (l1 != null)
    {
      int val = l1.val + carry;
      ListNode curr = new ListNode(val % 10);
      curr.next = addTwoNumbersKernel(l1.next, l2, val / 10);

      return curr;
    }
    else if (l2 != null)
    {
      int val = l2.val + carry;
      ListNode curr = new ListNode(val % 10);
      curr.next = addTwoNumbersKernel(l1, l2.next, val / 10);

      return curr;
    }
    else
    {
      if (carry != 0)
      {
        return new ListNode(carry);
      }
      else
      {
        return null;
      }
    }
  }
}
