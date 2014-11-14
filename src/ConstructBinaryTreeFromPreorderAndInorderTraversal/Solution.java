package ConstructBinaryTreeFromPreorderAndInorderTraversal;

import etc.TreeNode;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/13/2014
 */
public class Solution
{
  public TreeNode buildTree(int[] preorder, int[] inorder)
  {
    if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
    {
      return null;
    }

    return buildTreeKernel(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
  }

  private TreeNode buildTreeKernel(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight)
  {
    if (inLeft > inRight)
    {
      return null;
    }

    TreeNode curr = new TreeNode(preorder[preLeft]);

    int i = inLeft;
    while (i <= inRight)
    {
      if (inorder[i] == curr.val)
      {
        break;
      }
      i++;
    }

    curr.left = buildTreeKernel(preorder, preLeft + 1, preLeft + i - inLeft, inorder, inLeft, i - 1);
    curr.right = buildTreeKernel(preorder, preLeft + i - inLeft + 1, preRight, inorder, i + 1, inRight);

    return curr;
  }
}
