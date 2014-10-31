package Triangle;

import java.util.List;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/31/2014
 */
public class Solution
{
  public int minimumTotal(List<List<Integer>> triangle)
  {
    if (triangle == null || triangle.size() == 0)
    {
      return 0;
    }

    int[] row = new int[triangle.size() + 1];

    for (int i = triangle.size() - 1; i >= 0; i--)
    {
      for (int j = 0; j <= i; j++)
      {
        row[j] = triangle.get(i).get(j) + (row[j] < row[j + 1] ? row[j] : row[j + 1]);
      }
    }

    return row[0];
  }
}
