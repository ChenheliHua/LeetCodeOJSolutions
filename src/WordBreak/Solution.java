package WordBreak;

import java.util.HashMap;
import java.util.Set;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/6/2014
 */
public class Solution
{
  public boolean wordBreak(String s, Set<String> dict)
  {
    if (s == null || s.length() == 0)
    {
      return true;
    }

    return wordBreakKernel(s, 0, dict, new HashMap<Integer, Boolean>());
  }

  private boolean wordBreakKernel(String s, int idx, Set<String> dict, HashMap<Integer, Boolean> mem)
  {
    if (idx >= s.length())
    {
      return true;
    }

    if (mem.containsKey(idx))
    {
      return mem.get(idx);
    }

    for (int i = idx + 1; i <= s.length(); i++)
    {
      if (dict.contains(s.substring(idx, i)))
      {
        if (wordBreakKernel(s, i, dict, mem))
        {
          mem.put(idx, true);
          return true;
        }
      }
    }

    mem.put(idx, false);
    return false;
  }
}
