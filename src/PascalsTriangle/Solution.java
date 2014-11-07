package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/6/2014
 */
public class Solution
{
  public List<List<Integer>> generate(int numRows)
  {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    for (int i = 0; i < numRows; i++)
    {
      List<Integer> row = new ArrayList<Integer>();

      for (int j = 0; j <= i; j++)
      {
        if (j == 0 || j == i)
        {
          row.add(1);
        }
        else
        {
          row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
        }
      }

      result.add(row);
    }

    return result;
  }
}
