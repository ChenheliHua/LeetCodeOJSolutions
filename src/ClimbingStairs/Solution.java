package ClimbingStairs;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public int climbStairs(int n)
  {
    if (n <= 2)
    {
      return n;
    }

    int prev = 2;
    int prevPrev = 1;

    for (int i = 3; i <= n; i++)
    {
      int curr = prev + prevPrev;
      prevPrev = prev;
      prev = curr;
    }

    return prev;
  }
}
