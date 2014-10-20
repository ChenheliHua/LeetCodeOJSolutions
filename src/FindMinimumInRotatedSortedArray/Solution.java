package FindMinimumInRotatedSortedArray;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/20/2014
 */
public class Solution
{
  public int findMin(int[] num)
  {
    int left = 0;
    int right = num.length - 1;
    int mid;

    while (left < right)
    {
      mid = left + (right - left) / 2;

      if (num[mid] < num[right])
      {
        right = mid;
      }
      else
      {
        left = mid + 1;
      }
    }

    return num[left];
  }
}
