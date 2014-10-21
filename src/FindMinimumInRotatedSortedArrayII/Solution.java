package FindMinimumInRotatedSortedArrayII;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/21/2014
 */
public class Solution
{
  public int findMin(int[] num)
  {
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < num.length; i++)
    {
      if (num[i] < min)
      {
        min = num[i];
      }
    }

    return min;
  }
}
