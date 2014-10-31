package MaximumSubarray;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/30/2014
 */
public class Solution
{
  public int maxSubArray(int[] A)
  {
    return maxSubArrayKernel(A, 0, A.length - 1);
  }

  private int maxSubArrayKernel(int[] A, int left, int right)
  {
    if (left >= right)
    {
      return A[left];
    }

    int mid = left + (right - left) / 2;

    int leftMax = maxSubArrayKernel(A, left, mid);
    int rightMax = maxSubArrayKernel(A, mid + 1, right);

    int leftCrossMax = Integer.MIN_VALUE;
    int tmp = 0;
    for (int i = mid; i >= left; i--)
    {
      tmp += A[i];
      leftCrossMax = leftCrossMax > tmp ? leftCrossMax : tmp;
    }

    int rightCrossMax = Integer.MIN_VALUE;
    tmp = 0;
    for (int i = mid + 1; i <= right; i++)
    {
      tmp += A[i];
      rightCrossMax = rightCrossMax > tmp ? rightCrossMax : tmp;
    }

    return Math.max(Math.max(leftMax, rightMax), leftCrossMax + rightCrossMax);
  }
}
