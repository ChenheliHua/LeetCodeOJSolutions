package StringToIntegerAtoi;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/31/2014
 */
public class Solution
{
  public int atoi(String str)
  {
    if (str == null || str.length() == 0)
    {
      return 0;
    }

    int idx = 0;
    while (idx < str.length())
    {
      if (str.charAt(idx) == ' ' || str.charAt(idx) == '\t')
      {
        idx++;
      }
      else
      {
        break;
      }
    }

    boolean negative = false;
    if (idx < str.length() && (str.charAt(idx) == '+' || str.charAt(idx) == '-'))
    {
      negative = str.charAt(idx) == '-';
      idx++;
    }

    long value = 0;
    while (idx < str.length() && value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE)
    {
      if (str.charAt(idx) >= '0' && str.charAt(idx) <= '9')
      {
        value = value * 10 + str.charAt(idx) - '0';
        idx++;
      }
      else
      {
        break;
      }
    }

    value = negative ? -value : value;

    if (value <= Integer.MIN_VALUE)
    {
      return Integer.MIN_VALUE;
    }
    else if (value >= Integer.MAX_VALUE)
    {
      return Integer.MAX_VALUE;
    }
    else
    {
      return (int) value;
    }
  }

}
