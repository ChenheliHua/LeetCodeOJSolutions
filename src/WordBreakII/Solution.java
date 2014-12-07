package WordBreakII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/6/2014
 */
public class Solution
{

  public List<String> wordBreak(String s, Set<String> dict)
  {
    if (s == null || s.length() == 0)
    {
      return new ArrayList<String>();
    }

    return wordBreakKernel(s, 0, dict, new HashMap<Integer, List<String>>());
  }

  private List<String> wordBreakKernel(String s, int idx, Set<String> dict, HashMap<Integer, List<String>> mem)
  {
    if (mem.containsKey(idx))
    {
      return mem.get(idx);
    }

    List<String> result = new ArrayList<String>();

    if (idx >= s.length())
    {
      result.add("");

      mem.put(idx, result);
      return result;
    }

    for (int i = idx + 1; i <= s.length(); i++)
    {
      String sub = s.substring(idx, i);

      if (dict.contains(sub))
      {
        List<String> recur = wordBreakKernel(s, i, dict, mem);

        if (recur.size() != 0)
        {
          for (String str : recur)
          {
            if (str.length() > 0)
            {
              result.add(sub + " " + str);
            }
            else
            {
              result.add(sub);
            }
          }
        }
      }
    }

    mem.put(idx, result);
    return result;
  }
}
