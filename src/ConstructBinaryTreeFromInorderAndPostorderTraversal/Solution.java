package ConstructBinaryTreeFromInorderAndPostorderTraversal;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/14/2014
 */
public class Solution
{
  public TreeNode buildTree(int[] inorder, int[] postorder)
  {
    if (inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0)
    {
      return null;
    }

    return buildTreeKernel(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
  }

  private TreeNode buildTreeKernel(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight)
  {
    if (inLeft > inRight)
    {
      return null;
    }

    TreeNode curr = new TreeNode(postorder[postRight]);

    int i = inLeft;

    while (i <= inRight)
    {
      if (inorder[i] == curr.val)
      {
        break;
      }
      else
      {
        i++;
      }
    }

    curr.left = buildTreeKernel(inorder, inLeft, i - 1, postorder, postLeft, postLeft + i - inLeft - 1);
    curr.right = buildTreeKernel(inorder, i + 1, inRight, postorder, postLeft + i - inLeft, postRight - 1);

    return curr;
  }
}
