package BinaryTreePreorderTraversal;

import etc.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/20/2014
 */
public class Solution
{
  public List<Integer> preorderTraversal(TreeNode root)
  {
    List<Integer> result = new ArrayList<Integer>();

    TreeNode curr = root;
    TreeNode ptr;

    while (curr != null)
    {
      if (curr.left != null)
      {
        ptr = curr.left;

        while (ptr.right != null && ptr.right != curr)
        {
          ptr = ptr.right;
        }

        if (ptr.right != curr)
        {
          ptr.right = curr;
          result.add(curr.val);
          curr = curr.left;
        }
        else
        {
          ptr.right = null;
          curr = curr.right;
        }
      }
      else
      {
        result.add(curr.val);
        curr = curr.right;
      }
    }

    return result;
  }
}
