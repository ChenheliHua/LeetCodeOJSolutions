package PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/3/2015
 */
public class Solution
{
  public List<Integer> getRow(int rowIndex)
  {
    int[][] rows = new int[2][rowIndex + 1];
    int idx = 0;

    for (int i = 0; i <= rowIndex; i++)
    {
      for (int j = 0; j <= i; j++)
      {
        if (j == 0 || j == i)
        {
          rows[idx][j] = 1;
        }
        else
        {
          rows[idx][j] = rows[1 - idx][j - 1] + rows[1 - idx][j];
        }
      }

      idx = 1 - idx;
    }

    List<Integer> result = new ArrayList<Integer>();

    for (int i : rows[1 - idx])
    {
      result.add(i);
    }

    return result;

  }
}
