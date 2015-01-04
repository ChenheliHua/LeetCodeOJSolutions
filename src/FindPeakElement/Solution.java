package FindPeakElement;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/3/2015
 */
public class Solution
{
  public int findPeakElement(int[] num)
  {
    if (num == null || num.length == 0)
    {
      return -1;
    }

    return findPeakElementKernel(num, 0, num.length - 1);
  }

  private int findPeakElementKernel(int[] num, int left, int right)
  {
    if (left == right)
    {
      return left;
    }

    int mid = left + (right - left) / 2;

    if (mid > left && num[mid] > num[mid - 1])
    {
      left = mid;
    }
    else if (mid > left)
    {
      right = mid - 1;
    }
    else if (mid < right && num[mid] > num[mid + 1])
    {
      right = mid;
    }
    else
    {
      left = mid + 1;
    }

    return findPeakElementKernel(num, left, right);
  }
}
