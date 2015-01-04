package ThreeSumClosest;

import java.util.Arrays;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/4/2015
 */
public class Solution
{
  public int threeSumClosest(int[] num, int target)
  {
    if (num == null || num.length < 3)
    {
      return 0;
    }

    Arrays.sort(num);

    int sum = num[0] + num[1] + num[num.length - 1];

    for (int i = 0; i < num.length - 2; i++)
    {
      int l = i + 1;
      int r = num.length - 1;

      while (l < r)
      {
        int curr = num[i] + num[l] + num[r];

        if (curr == target)
        {
          return target;
        }
        else if (curr > target)
        {
          if (Math.abs(curr - target) < Math.abs(sum - target))
          {
            sum = curr;
          }

          r--;
        }
        else
        {
          if (Math.abs(curr - target) < Math.abs(sum - target))
          {
            sum = curr;
          }

          l++;
        }
      }
    }

    return sum;
  }
}
