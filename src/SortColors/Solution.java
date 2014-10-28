package SortColors;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public void sortColors(int[] A)
  {
    if (A == null)
    {
      return;
    }

    int left = 0;
    int right = A.length - 1;

    int i = 0;
    while (i < A.length && i <= right)
    {
      int tmp;
      switch (A[i])
      {
        case 0:
          tmp = A[i];
          A[i] = A[left];
          A[left] = tmp;
          left++;
          i++;
          break;
        case 1:
          i++;
          break;
        case 2:
          tmp = A[i];
          A[i] = A[right];
          A[right] = tmp;
          right--;
          break;
      }
    }
  }
}
