package SearchForARange;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/30/2014
 */
public class Solution
{
  int leftIdx;
  int rightIdx;

  public int[] searchRange(int[] A, int target)
  {
    leftIdx = A.length;
    rightIdx = -1;

    searchRangeKernel(A, 0, A.length - 1, target);

    if (rightIdx == -1)
    {
      return new int[]{-1, -1};
    }
    else
    {
      return new int[]{leftIdx, rightIdx};
    }
  }

  private void searchRangeKernel(int[] A, int left, int right, int target)
  {
    if (left > right)
    {
      return;
    }

    int mid = left + (right - left) / 2;

    if (A[mid] == target)
    {
      leftIdx = Math.min(leftIdx, mid);
      rightIdx = Math.max(rightIdx, mid);

      searchRangeKernel(A, left, mid - 1, target);
      searchRangeKernel(A, mid + 1, right, target);
    }
    else if (A[mid] > target)
    {
      searchRangeKernel(A, left, mid - 1, target);
    }
    else
    {
      searchRangeKernel(A, mid + 1, right, target);
    }
  }
}
