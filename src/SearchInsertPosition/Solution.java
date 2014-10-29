package SearchInsertPosition;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/29/2014
 */
public class Solution
{
  public int searchInsert(int[] A, int target)
  {
    int left = 0;
    int right = A.length - 1;

    while (left <= right)
    {
      int mid = left + (right - left) / 2;

      if (A[mid] == target)
      {
        return mid;
      }
      else if (A[mid] > target)
      {
        right = mid - 1;
      }
      else
      {
        left = mid + 1;
      }
    }

    return left;
  }
}
