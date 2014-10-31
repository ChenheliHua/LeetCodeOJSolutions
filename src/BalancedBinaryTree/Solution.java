package BalancedBinaryTree;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/30/2014
 */
public class Solution
{
  boolean isBalanced = true;

  public boolean isBalanced(TreeNode root)
  {
    isBalancedKernel(root);

    return isBalanced;
  }

  private int isBalancedKernel(TreeNode root)
  {
    if (root == null)
    {
      return 0;
    }

    int leftDepth = isBalancedKernel(root.left);
    int rightDepth = isBalancedKernel(root.right);

    if (Math.abs(leftDepth - rightDepth) > 1)
    {
      isBalanced = false;
    }

    return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
  }
}
