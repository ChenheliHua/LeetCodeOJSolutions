package BinaryTreeMaximumPathSum;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/6/2014
 */
public class Solution
{
  private int maxSum = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root)
  {
    maxPathSumKernel(root);

    return this.maxSum;
  }

  private int maxPathSumKernel(TreeNode root)
  {
    if (root == null)
    {
      return 0;
    }

    int leftSum = maxPathSumKernel(root.left);
    int rightSum = maxPathSumKernel(root.right);

    int leftPathSum = Math.max(root.val, root.val + leftSum);
    int rightPathSum = Math.max(root.val, root.val + rightSum);

    int crossSum = root.val;

    if (leftSum > 0)
    {
      crossSum += leftSum;
    }

    if (rightSum > 0)
    {
      crossSum += rightSum;
    }

    this.maxSum = Math.max(this.maxSum, Math.max(Math.max(leftPathSum, rightPathSum), crossSum));

    return Math.max(leftPathSum, rightPathSum);
  }
}
