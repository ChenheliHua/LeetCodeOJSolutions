package ValidateBinarySearchTree;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/25/2014
 */
public class Solution
{
  public boolean isValidBST(TreeNode root)
  {
    // Cast int to long so that the tree can contain edge values (Integer.MAX_VALUE and Integer.MIN_VALUE).
    return isValidBSTKernel(root, (long) (Integer.MAX_VALUE) + 1, (long) (Integer.MIN_VALUE) - 1);
  }

  private boolean isValidBSTKernel(TreeNode root, long max, long min)
  {
    if (root == null)
    {
      return true;
    }

    if ((long) root.val >= max || (long) root.val <= min)
    {
      return false;
    }

    return isValidBSTKernel(root.left, root.val, min) &&
      isValidBSTKernel(root.right, max, root.val);
  }
}
