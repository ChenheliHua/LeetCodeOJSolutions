package LongestCommonPrefix;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/7/2014
 */
public class Solution
{
  public String longestCommonPrefix(String[] strs)
  {
    if (strs == null || strs.length == 0)
    {
      return "";
    }

    int idx = 0;
    char curr;

    while (true)
    {
      if (strs[0] == null || strs[0].length() == idx)
      {
        break;
      }
      else
      {
        curr = strs[0].charAt(idx);

        for (int i = 1; i < strs.length; i++)
        {
          if (strs[i] == null || strs[i].length() == idx || strs[i].charAt(idx) != curr)
          {
            return strs[0].substring(0, idx);
          }
        }

        idx++;
      }
    }

    return strs[0] == null ? "" : strs[0].substring(0, idx);
  }
}
