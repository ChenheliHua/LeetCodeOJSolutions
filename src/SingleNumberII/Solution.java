package SingleNumberII;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public int singleNumber(int[] A)
  {
    int[] bits = new int[32];

    for (int a : A)
    {
      for (int i = 0; i < 32; i++)
      {
        if ((a & (1 << i)) != 0)
        {
          bits[i]++;
        }
      }
    }

    int result = 0;

    for (int i = 0; i < 32; i++)
    {
      if (bits[i] % 3 != 0)
      {
        result |= (1 << i);
      }
    }

    return result;
  }
}
