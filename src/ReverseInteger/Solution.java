package ReverseInteger;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/6/2014
 */
public class Solution
{
  public int reverse(int x)
  {
    long reversed = 0;

    boolean negative = false;

    if (x < 0)
    {
      x = -x;
      negative = true;
    }

    while (x > 0)
    {
      reversed = 10 * reversed + (x - (x / 10) * 10);
      x /= 10;
    }

    reversed = negative ? -reversed : reversed;

    if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
    {
      return 0;
    }
    else
    {
      return (int) reversed;
    }
  }
}
