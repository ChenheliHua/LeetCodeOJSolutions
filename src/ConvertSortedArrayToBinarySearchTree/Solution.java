package ConvertSortedArrayToBinarySearchTree;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/26/2014
 */
public class Solution
{
  public TreeNode sortedArrayToBST(int[] num)
  {
    if (num == null)
    {
      return null;
    }

    return buildBSTNode(num, 0, num.length - 1);
  }

  private TreeNode buildBSTNode(int[] num, int left, int right)
  {
    if (left > right)
    {
      return null;
    }
    else if (left == right)
    {
      return new TreeNode(num[left]);
    }
    else
    {
      int mid = left + (right - left) / 2;

      TreeNode currNode = new TreeNode(num[mid]);

      TreeNode leftChild = buildBSTNode(num, left, mid - 1);
      TreeNode rightChild = buildBSTNode(num, mid + 1, right);

      currNode.left = leftChild;
      currNode.right = rightChild;

      return currNode;
    }
  }
}
