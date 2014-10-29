package Anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public List<String> anagrams(String[] strs)
  {
    int[] map = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
      31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
      73, 79, 83, 89, 97, 101};

    HashMap<Long, List<String>> hash = new HashMap<Long, List<String>>();

    for (String s : strs)
    {
      long prod = 1;

      for (int i = 0; i < s.length(); i++)
      {
        prod *= map[s.charAt(i) - 'a'];
      }

      if (hash.containsKey(prod))
      {
        hash.get(prod).add(s);
      }
      else
      {
        List<String> list = new ArrayList<String>();
        list.add(s);
        hash.put(prod, list);
      }
    }

    List<String> result = new ArrayList<String>();

    for (Long l : hash.keySet())
    {
      if (hash.get(l).size() > 1)
      {
        result.addAll(hash.get(l));
      }
    }

    return result;
  }
}
