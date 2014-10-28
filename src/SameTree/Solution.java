package SameTree;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public boolean isSameTree(TreeNode p, TreeNode q)
  {
    if (p == null && q == null)
    {
      return true;
    }
    else if (p == null || q == null)
    {
      return false;
    }
    else
    {
      return p.val == q.val &&
        isSameTree(p.left, q.left) &&
        isSameTree(p.right, q.right);
    }
  }
}
