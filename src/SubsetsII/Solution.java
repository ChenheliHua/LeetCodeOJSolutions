package SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/31/2014
 */
public class Solution
{
  public List<List<Integer>> subsetsWithDup(int[] num)
  {
    if (num == null || num.length == 0)
    {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      result.add(new ArrayList<Integer>());

      return result;
    }

    Arrays.sort(num);
    return subsetsWithDupKernel(num, 0);
  }

  private List<List<Integer>> subsetsWithDupKernel(int[] num, int idx)
  {
    if (num.length == idx)
    {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      result.add(new ArrayList<Integer>());

      return result;
    }

    int curr = num[idx];
    int count = 1;

    for (int i = idx + 1; i < num.length; i++)
    {
      if (num[i] == curr)
      {
        count++;
      }
      else
      {
        break;
      }
    }

    List<List<Integer>> recur = subsetsWithDupKernel(num, idx + count);
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    for (List<Integer> l : recur)
    {
      for (int element = 0; element <= count; element++)
      {
        List<Integer> newList = new LinkedList<Integer>(l);

        for (int i = 0; i < element; i++)
        {
          newList.add(0, curr);
        }

        result.add(newList);
      }
    }

    return result;
  }
}
