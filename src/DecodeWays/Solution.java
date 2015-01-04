package DecodeWays;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/3/2015
 */
public class Solution
{
  public int numDecodings(String s)
  {
    if (s == null || s.length() == 0)
    {
      return 0;
    }

    int[] mem = new int[s.length()];

    for (int i = 0; i < mem.length; i++)
    {
      mem[i] = -1;
    }

    return numDecodingsKernel(s, 0, mem);
  }

  private int numDecodingsKernel(String s, int idx, int[] mem)
  {
    if (idx == s.length())
    {
      return 1;
    }

    if (mem[idx] != -1)
    {
      return mem[idx];
    }

    int total = 0;
    int one = Integer.parseInt(s.substring(idx, idx + 1));

    if (one > 0)
    {
      total += numDecodingsKernel(s, idx + 1, mem);
    }
    else
    {
      mem[idx] = 0;
      return 0;
    }

    if (idx + 1 < s.length())
    {
      int two = Integer.parseInt(s.substring(idx, idx + 2));

      if (two > 0 && two <= 26)
      {
        total += numDecodingsKernel(s, idx + 2, mem);
      }
    }

    mem[idx] = total;
    return total;
  }
}
