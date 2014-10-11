package TwoSum;

import java.util.HashMap;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/10/2014
 */
public class Solution
{
  public int[] twoSum(int[] numbers, int target)
  {
    if (numbers == null || numbers.length < 2)
    {
      return new int[]{-1, -1};
    }

    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

    for (int i = 0; i < numbers.length; i++)
    {
      if (hash.containsKey(numbers[i]))
      {
        return new int[]{hash.get(numbers[i]) + 1, i + 1};
      }

      hash.put(target - numbers[i], i);
    }

    return new int[]{-1, -1};
  }
}
