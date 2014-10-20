package BinaryTreePostorderTraversal;

import etc.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/20/2014
 */
public class Solution
{
  public List<Integer> postorderTraversal(TreeNode root)
  {
    List<Integer> result = new ArrayList<Integer>();
    Stack<Integer> stack = new Stack<Integer>();

    TreeNode curr = root;
    TreeNode ptr;

    while (curr != null)
    {
      if (curr.right != null)
      {
        ptr = curr.right;

        while (ptr.left != null && ptr.left != curr)
        {
          ptr = ptr.left;
        }

        if (ptr.left != curr)
        {
          ptr.left = curr;
          stack.push(curr.val);
          curr = curr.right;
        }
        else
        {
          ptr.left = null;
          curr = curr.left;
        }
      }
      else
      {
        stack.push(curr.val);
        curr = curr.left;
      }
    }

    while (!stack.isEmpty())
    {
      result.add(stack.pop());
    }

    return result;
  }
}
