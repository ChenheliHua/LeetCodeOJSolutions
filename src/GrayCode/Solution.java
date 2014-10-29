package GrayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/28/2014
 */
public class Solution
{
  public List<Integer> grayCode(int n)
  {
    if (n == 0)
    {
      List<Integer> result = new ArrayList<Integer>();
      result.add(0);

      return result;
    }

    List<Integer> recur = grayCode(n - 1);

    List<Integer> result = new ArrayList<Integer>(recur);


    for (int i = recur.size() - 1; i >= 0; i--)
    {
      result.add(recur.get(i) | (1 << (n - 1)));
    }

    return result;
  }
}
