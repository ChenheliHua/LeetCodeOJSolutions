package MergeSortedArray;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/29/2014
 */
public class Solution
{
  public void merge(int A[], int m, int B[], int n)
  {
    int aIdx = m - 1;
    int bIdx = n - 1;
    int idx = m + n - 1;

    while (aIdx >= 0 && bIdx >= 0)
    {
      if (A[aIdx] > B[bIdx])
      {
        A[idx] = A[aIdx];
        aIdx--;
      }
      else
      {
        A[idx] = B[bIdx];
        bIdx--;
      }

      idx--;
    }

    while (bIdx >= 0)
    {
      A[idx] = B[bIdx];
      bIdx--;
      idx--;
    }
  }
}
