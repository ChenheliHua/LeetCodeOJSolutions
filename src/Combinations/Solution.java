package Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/6/2014
 */
public class Solution
{
  public List<List<Integer>> combine(int n, int k)
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    if (k == 0)
    {
      result.add(new ArrayList<Integer>());
      return result;
    }

    if (n == k)
    {
      List<Integer> list = new ArrayList<Integer>();

      for (int i = 1; i <= n; i++)
      {
        list.add(i);
      }

      result.add(list);

      return result;
    }

    List<List<Integer>> recur = combine(n - 1, k - 1);

    for (List<Integer> list : recur)
    {
      list.add(n);
      result.add(list);
    }

    result.addAll(combine(n - 1, k));

    return result;
  }
}
