package RemoveDuplicatesFromSortedArrayII;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/31/2014
 */
public class Solution
{
  public int removeDuplicates(int[] A)
  {
    if (A == null)
    {
      return 0;
    }
    else if (A.length <= 1)
    {
      return A.length;
    }

    int prev = A[0];
    int count = 1;
    int offset = 0;

    for (int i = 1; i < A.length; i++)
    {
      A[i - offset] = A[i];

      if (A[i] == prev)
      {
        if (count == 1)
        {
          count++;
        }
        else
        {
          offset++;
        }
      }
      else
      {
        prev = A[i];
        count = 1;
      }
    }

    return A.length - offset;
  }
}
