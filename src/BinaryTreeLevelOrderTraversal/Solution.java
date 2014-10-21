package BinaryTreeLevelOrderTraversal;

import etc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/21/2014
 */
public class Solution
{
  public List<List<Integer>> levelOrder(TreeNode root)
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    if (root == null)
    {
      return result;
    }

    List<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);

    int curr = 1;
    int next = 0;

    TreeNode ptr;
    List<Integer> currList = new ArrayList<Integer>();
    while (!queue.isEmpty())
    {
      ptr = queue.remove(0);
      currList.add(ptr.val);
      curr--;

      if (ptr.left != null)
      {
        queue.add(ptr.left);
        next++;
      }

      if (ptr.right != null)
      {
        queue.add(ptr.right);
        next++;
      }

      if (curr == 0)
      {
        result.add(currList);
        currList = new ArrayList<Integer>();

        curr = next;
        next = 0;
      }
    }

    return result;
  }
}
