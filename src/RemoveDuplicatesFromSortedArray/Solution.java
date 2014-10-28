package RemoveDuplicatesFromSortedArray;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public int removeDuplicates(int[] A)
  {
    if (A == null || A.length == 0)
    {
      return 0;
    }

    int prev = A[0];
    int count = 0;

    for (int i = 1; i < A.length; i++)
    {
      if (A[i] == prev)
      {
        count++;
      }
      else
      {
        A[i - count] = A[i];
        prev = A[i];
      }
    }

    return A.length - count;
  }
}
