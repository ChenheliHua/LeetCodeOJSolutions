package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/30/2014
 */
public class Solution
{
  public List<List<Integer>> threeSum(int[] num)
  {
    Arrays.sort(num);

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    for (int i = 0; i < num.length - 2; )
    {
      int left = i + 1;
      int right = num.length - 1;

      while (left < right)
      {
        if (num[left] + num[right] + num[i] == 0)
        {
          List<Integer> set = new ArrayList<Integer>();

          set.add(num[i]);
          set.add(num[left]);
          set.add(num[right]);

          result.add(set);

          left++;
          while (left < right && num[left - 1] == num[left])
          {
            left++;
          }

          right--;
          while (left < right && num[right + 1] == num[right])
          {
            right--;
          }
        }
        else if (num[left] + num[right] + num[i] > 0)
        {
          right--;
        }
        else
        {
          left++;
        }
      }

      i++;
      while (i < num.length && num[i - 1] == num[i])
      {
        i++;
      }
    }

    return result;
  }
}
