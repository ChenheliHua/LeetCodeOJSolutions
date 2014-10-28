package FirstMissingPositive;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public int firstMissingPositive(int[] A)
  {
    if (A == null)
    {
      return 0;
    }

    int tmp;
    for (int i = 0; i < A.length; )
    {
      if (A[i] >= 1 && A[i] <= A.length && A[i] != i + 1 && A[i] != A[A[i] - 1])
      {
        tmp = A[i];
        A[i] = A[tmp - 1];
        A[tmp - 1] = tmp;
      }
      else
      {
        i++;
      }
    }

    for (int i = 0; i < A.length; i++)
    {
      if (A[i] != i + 1)
      {
        return i + 1;
      }
    }

    return A.length + 1;
  }
}
