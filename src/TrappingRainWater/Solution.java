package TrappingRainWater;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/14/2014
 */
public class Solution
{
  public int trap(int[] A)
  {
    int[] maxLeft = new int[A.length];
    int[] maxRight = new int[A.length];

    int max = 0;
    for (int i = 0; i < A.length; i++)
    {
      max = Math.max(max, A[i]);
      maxLeft[i] = max;
    }

    max = 0;
    for (int i = A.length - 1; i >= 0; i--)
    {
      max = Math.max(max, A[i]);
      maxRight[i] = max;
    }

    int water = 0;
    for (int i = 0; i < A.length; i++)
    {
      water += Math.min(maxLeft[i], maxRight[i]) - A[i];
    }

    return water;
  }
}
