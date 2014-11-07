package PathSumII;

import etc.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/7/2014
 */
public class Solution
{
  public List<List<Integer>> pathSum(TreeNode root, int sum)
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    if (root == null)
    {
      return result;
    }

    pathSumerKernel(root, sum, 0, new ArrayList<Integer>(), result);

    return result;
  }

  private void pathSumerKernel(TreeNode root, int sum, int currSum, List<Integer> currList, List<List<Integer>> result)
  {
    if (root.left == null && root.right == null)
    {
      if (sum == currSum + root.val)
      {
        currList.add(root.val);
        result.add(currList);
      }
    }
    else if (root.left == null)
    {
      currList.add(root.val);
      pathSumerKernel(root.right, sum, currSum + root.val, currList, result);
    }
    else if (root.right == null)
    {
      currList.add(root.val);
      pathSumerKernel(root.left, sum, currSum + root.val, currList, result);
    }
    else
    {
      currList.add(root.val);

      pathSumerKernel(root.left, sum, currSum + root.val, new ArrayList<Integer>(currList), result);
      pathSumerKernel(root.right, sum, currSum + root.val, currList, result);
    }
  }
}
