package JumpGameII;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public int jump(int[] A)
  {
    if (A == null)
    {
      return 0;
    }

    int pos = 0;
    int step = 0;

    while (pos < A.length - 1)
    {
      int nextPos = pos;
      int reach = 0;

      for (int i = 1; i <= A[pos]; i++)
      {
        if (pos + i >= A.length - 1)
        {
          return step + 1;
        }

        if (pos + i + A[pos + i] > reach)
        {
          reach = pos + i + A[pos + i];
          nextPos = pos + i;
        }
      }

      step++;
      pos = nextPos;
    }

    return step;
  }
}
