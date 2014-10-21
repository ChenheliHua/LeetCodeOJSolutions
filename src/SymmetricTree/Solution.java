package SymmetricTree;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/21/2014
 */
public class Solution
{
  public boolean isSymmetric(TreeNode root)
  {
    if (root == null)
    {
      return true;
    }

    return isSymmetricKernel(root.left, root.right);
  }

  private boolean isSymmetricKernel(TreeNode node1, TreeNode node2)
  {
    if (node1 == null && node2 == null)
    {
      return true;
    }

    if (node1 == null || node2 == null || node1.val != node2.val)
    {
      return false;
    }

    return isSymmetricKernel(node1.left, node2.right) && isSymmetricKernel(node1.right, node2.left);
  }
}
