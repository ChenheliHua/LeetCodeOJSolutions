package SumRootToLeafNumbers;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/26/2014
 */
public class Solution
{
  public int sumNumbers(TreeNode root)
  {
    return sumNumbersKernel(root, 0);
  }

  private int sumNumbersKernel(TreeNode root, int sum)
  {
    if (root == null)
    {
      return sum;
    }

    if (root.left == null && root.right == null)
    {
      return sum * 10 + root.val;
    }
    else if (root.left == null)
    {
      return sumNumbersKernel(root.right, sum * 10 + root.val);
    }
    else if (root.right == null)
    {
      return sumNumbersKernel(root.left, sum * 10 + root.val);
    }
    else
    {
      return sumNumbersKernel(root.left, sum * 10 + root.val) + sumNumbersKernel(root.right, sum * 10 + root.val);
    }
  }
}
