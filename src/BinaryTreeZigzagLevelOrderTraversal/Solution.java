package BinaryTreeZigzagLevelOrderTraversal;

import etc.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/13/2014
 */
public class Solution
{
  public List<List<Integer>> zigzagLevelOrder(TreeNode root)
  {
    if (root == null)
    {
      return new ArrayList<List<Integer>>();
    }

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    queue.addLast(root);

    int curr = 1;
    int next = 0;

    boolean forwardOrder = true;

    LinkedList<Integer> currLevel = new LinkedList<Integer>();

    while (!queue.isEmpty())
    {
      TreeNode n = queue.removeFirst();
      curr--;

      if (forwardOrder)
      {
        currLevel.addLast(n.val);
      }
      else
      {
        currLevel.addFirst(n.val);
      }

      if (n.left != null)
      {
        queue.addLast(n.left);
        next++;
      }

      if (n.right != null)
      {
        queue.addLast(n.right);
        next++;
      }

      if (curr == 0)
      {
        curr = next;
        next = 0;
        result.add(currLevel);
        currLevel = new LinkedList<Integer>();
        forwardOrder = !forwardOrder;
      }
    }

    return result;
  }
}
