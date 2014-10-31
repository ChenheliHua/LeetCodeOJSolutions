package PowXN;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/30/2014
 */
public class Solution
{
  // y*(x^n)
  public double pow(double x, int n)
  {
    if (x == 0 || x == 1)
    {
      return x;
    }

    if (n == 0)
    {
      return 1;
    }

    boolean negative = false;

    if (n < 0)
    {
      negative = true;
      n = ~n + 1;
    }

    double y = 1;

    while (n > 0)
    {
      if ((n & 1) == 0)
      {
        x = x * x;
        n >>= 1;
      }
      else
      {
        y *= x;
        n -= 1;
      }
    }

    return negative ? 1 / y : y;
  }
}
