package SearchInRotatedSortedArrayII;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public boolean search(int[] A, int target)
  {
    if (A == null)
    {
      return false;
    }

    for (int i : A)
    {
      if (i == target)
      {
        return true;
      }
    }

    return false;
  }
}
