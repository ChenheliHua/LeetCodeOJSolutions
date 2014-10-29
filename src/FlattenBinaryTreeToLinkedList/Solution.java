package FlattenBinaryTreeToLinkedList;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  TreeNode head;
  TreeNode tail;

  public void flatten(TreeNode root)
  {
    if (root == null)
    {
      return;
    }

    TreeNode left = root.left;
    TreeNode right = root.right;

    if (head == null)
    {
      head = root;
      tail = root;
      tail.left = null;
    }
    else
    {
      tail.right = root;
      tail.left = null;
      tail = tail.right;
    }

    flatten(left);
    flatten(right);
  }
}
