package ConvertSortedListToBinarySearchTree;

import etc.ListNode;
import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/26/2014
 */
public class Solution
{
  private ListNode list;

  public TreeNode sortedListToBST(ListNode head)
  {
    ListNode ptr = head;
    int len = 0;

    while (ptr != null)
    {
      len++;
      ptr = ptr.next;
    }

    list = head;

    return buildBSTNode(0, len - 1);
  }

  private TreeNode buildBSTNode(int left, int right)
  {
    if (left > right)
    {
      return null;
    }
    else if (left == right)
    {
      TreeNode n = new TreeNode(list.val);
      list = list.next;

      return n;
    }
    else
    {
      int mid = left + (right - left) / 2;

      TreeNode leftChild = buildBSTNode(left, mid - 1);

      TreeNode currNode = new TreeNode(list.val);
      list = list.next;

      TreeNode rightChild = buildBSTNode(mid + 1, right);

      currNode.left = leftChild;
      currNode.right = rightChild;

      return currNode;
    }
  }
}
