package Permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/31/2014
 */
public class Solution
{
  public List<List<Integer>> permute(int[] num)
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    if (num == null || num.length == 0)
    {
      result.add(new ArrayList<Integer>());

      return result;
    }

    permuteKernel(num, 0, result);

    return result;
  }

  private void permuteKernel(int[] num, int idx, List<List<Integer>> result)
  {
    if (num.length == idx)
    {
      List<Integer> list = new ArrayList<Integer>();

      for (int i : num)
      {
        list.add(i);
      }

      result.add(list);

      return;
    }

    for (int i = idx; i < num.length; i++)
    {
      swap(num, i, idx);
      permuteKernel(num, idx + 1, result);
      swap(num, i, idx);
    }

    return;
  }

  private void swap(int[] num, int i, int j)
  {
    int tmp = num[i];
    num[i] = num[j];
    num[j] = tmp;
  }
}
