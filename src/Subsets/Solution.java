package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/7/2014
 */
public class Solution
{
  public List<List<Integer>> subsets(int[] S)
  {
    if (S == null || S.length == 0)
    {
      return new ArrayList<List<Integer>>();
    }

    Arrays.sort(S);

    return subsetsKernel(S, 0);
  }

  private List<List<Integer>> subsetsKernel(int[] S, int idx)
  {
    if (idx == S.length - 1)
    {
      List<List<Integer>> result = new ArrayList<List<Integer>>();

      result.add(new ArrayList<Integer>());

      List<Integer> l = new ArrayList<Integer>();
      l.add(S[idx]);
      result.add(l);

      return result;
    }

    List<List<Integer>> recur = subsetsKernel(S, idx + 1);

    List<List<Integer>> result = new ArrayList<List<Integer>>(recur);

    for (List<Integer> l : recur)
    {
      List<Integer> list = new ArrayList<Integer>();
      list.add(S[idx]);
      list.addAll(l);
      result.add(list);
    }

    return result;
  }
}
