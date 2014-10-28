package RemoveElement;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public int removeElement(int[] A, int elem)
  {
    if (A == null)
    {
      return 0;
    }

    int count = 0;
    for (int i = 0; i < A.length; i++)
    {
      if (A[i] == elem)
      {
        count++;
      }
      else
      {
        A[i - count] = A[i];
      }
    }

    return A.length - count;
  }
}
