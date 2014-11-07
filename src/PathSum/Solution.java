package PathSum;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/6/2014
 */
public class Solution
{
  public boolean hasPathSum(TreeNode root, int sum)
  {
    if (root == null)
    {
      return false;
    }

    return hasPathSumKernel(root, sum, 0);
  }

  private boolean hasPathSumKernel(TreeNode root, int sum, int currSum)
  {
    if (root.left == null && root.right == null)
    {
      return sum == currSum + root.val;
    }
    else if (root.left == null)
    {
      return hasPathSumKernel(root.right, sum, currSum + root.val);
    }
    else if (root.right == null)
    {
      return hasPathSumKernel(root.left, sum, currSum + root.val);
    }
    else
    {
      return hasPathSumKernel(root.right, sum, currSum + root.val) ||
        hasPathSumKernel(root.left, sum, currSum + root.val);
    }
  }
}
