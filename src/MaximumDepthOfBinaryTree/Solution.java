package MaximumDepthOfBinaryTree;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public int maxDepth(TreeNode root)
  {
    if (root == null)
    {
      return 0;
    }
    else
    {
      int l = maxDepth(root.left);
      int r = maxDepth(root.right);

      return l > r ? l + 1 : r + 1;
    }
  }
}
