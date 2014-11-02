package LongestSubstringWithoutRepeatingCharacters;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/2/2014
 */
public class Solution
{
  public int lengthOfLongestSubstring(String s)
  {
    int[] idx = new int[256];

    for (int i = 0; i < idx.length; i++)
    {
      idx[i] = -1;
    }

    int longest = 0;

    for (int i = 0; i < s.length(); i++)
    {
      if (idx[s.charAt(i)] == -1)
      {
        idx[s.charAt(i)] = i;
      }
      else
      {
        int prev = idx[s.charAt(i)];

        for (int j = 0; j < idx.length; j++)
        {
          if (idx[j] != -1 && idx[j] <= prev)
          {
            // i - 1 - idx[j] + 1
            if (i - idx[j] > longest)
            {
              longest = i - idx[j];
            }

            idx[j] = -1;
          }
        }

        idx[s.charAt(i)] = i;
      }
    }

    for (int j = 0; j < idx.length; j++)
    {
      if (idx[j] != -1)
      {
        // s.length - 1 - idx[j] + 1
        if (s.length() - idx[j] > longest)
        {
          longest = s.length() - idx[j];
        }
      }
    }

    return longest;
  }
}
