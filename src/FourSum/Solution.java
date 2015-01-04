package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/3/2015
 */
public class Solution
{
  public List<List<Integer>> fourSum(int[] num, int target)
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    if (num == null || num.length < 4)
    {
      return result;
    }

    Arrays.sort(num);

    for (int i = 0; i < num.length - 3; i++)
    {
      for (int j = i + 1; j < num.length - 2; j++)
      {
        int l = j + 1;
        int r = num.length - 1;

        while (l < r)
        {
          if (num[i] + num[j] + num[l] + num[r] == target)
          {
            List<Integer> list = new ArrayList<Integer>();

            list.add(num[i]);
            list.add(num[j]);
            list.add(num[l]);
            list.add(num[r]);

            result.add(list);

            while (l < num.length - 1)
            {
              if (num[l] == num[l + 1])
              {
                l++;
              }
              else
              {
                break;
              }
            }

            while (r > 0)
            {
              if (num[r] == num[r - 1])
              {
                r--;
              }
              else
              {
                break;
              }
            }

            l++;
          }
          else if (num[i] + num[j] + num[l] + num[r] < target)
          {
            l++;
          }
          else
          {
            r--;
          }
        }

        while (j < num.length - 1)
        {
          if (num[j] == num[j + 1])
          {
            j++;
          }
          else
          {
            break;
          }
        }
      }

      while (i < num.length - 1)
      {
        if (num[i] == num[i + 1])
        {
          i++;
        }
        else
        {
          break;
        }
      }
    }

    return result;
  }
}
