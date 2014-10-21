package SingleNumber;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/21/2014
 */
public class Solution
{
  public int singleNumber(int[] A)
  {
    int n = 0;

    for (int a : A)
    {
      n ^= a;
    }

    return n;
  }
}
