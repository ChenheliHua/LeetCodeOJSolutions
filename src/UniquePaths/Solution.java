package UniquePaths;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/13/2014
 */
public class Solution
{
  public int uniquePaths(int m, int n)
  {
    if (m == 0 || n == 0)
    {
      return 1;
    }

    int[][] paths = new int[m][n];

    for (int i = 0; i < m; i++)
    {
      paths[i][0] = 1;
    }

    for (int j = 0; j < n; j++)
    {
      paths[0][j] = 1;
    }

    for (int i = 1; i < m; i++)
    {
      for (int j = 1; j < n; j++)
      {
        paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
      }
    }

    return paths[m - 1][n - 1];
  }
}
