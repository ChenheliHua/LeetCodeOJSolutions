package LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/3/2015
 */
public class Solution
{
  public int longestConsecutive(int[] num)
  {
    if (num == null || num.length == 0)
    {
      return 0;
    }

    Set<Integer> set = new HashSet<Integer>();

    for (int i : num)
    {
      set.add(i);
    }

    int longest = 0;
    for (int i : set.toArray(new Integer[set.size()]))
    {
      if (set.contains(i))
      {
        int currLength = 1;
        set.remove(i);

        for (int j = i + 1; set.contains(j); j++)
        {
          currLength++;
          set.remove(j);
        }

        for (int j = i - 1; set.contains(j); j--)
        {
          currLength++;
          set.remove(j);
        }

        longest = Math.max(longest, currLength);
      }
    }

    return longest;
  }
}
