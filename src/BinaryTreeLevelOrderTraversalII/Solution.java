package BinaryTreeLevelOrderTraversalII;

import etc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/6/2014
 */
public class Solution
{
  public List<List<Integer>> levelOrderBottom(TreeNode root)
  {
    LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();

    if (root == null)
    {
      return result;
    }

    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    queue.addLast(root);

    List<Integer> level = new ArrayList<Integer>();

    int curr = 1;
    int next = 0;

    while (!queue.isEmpty())
    {
      TreeNode currNode = queue.removeFirst();
      curr--;

      level.add(currNode.val);

      if (currNode.left != null)
      {
        queue.addLast(currNode.left);
        next++;
      }

      if (currNode.right != null)
      {
        queue.addLast(currNode.right);
        next++;
      }

      if (curr == 0)
      {
        result.addFirst(level);
        level = new ArrayList<Integer>();

        curr = next;
        next = 0;
      }
    }

    return result;
  }
}
