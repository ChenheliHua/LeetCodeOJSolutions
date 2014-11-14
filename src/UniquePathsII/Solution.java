package UniquePathsII;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 11/13/2014
 */
public class Solution
{
  public int uniquePathsWithObstacles(int[][] obstacleGrid)
  {
    if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0)
    {
      return 0;
    }

    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] paths = new int[m][n];

    paths[0][0] = obstacleGrid[0][0] == 0 ? 1 : 0;

    for (int i = 1; i < m; i++)
    {
      if (obstacleGrid[i][0] == 0)
      {
        paths[i][0] = paths[i - 1][0];
      }
      else
      {
        paths[i][0] = 0;
      }
    }

    for (int j = 1; j < n; j++)
    {
      if (obstacleGrid[0][j] == 0)
      {
        paths[0][j] = paths[0][j - 1];
      }
      else
      {
        paths[0][j] = 0;
      }
    }

    for (int i = 1; i < m; i++)
    {
      for (int j = 1; j < n; j++)
      {
        if (obstacleGrid[i][j] == 0)
        {
          paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
        }
        else
        {
          paths[i][j] = 0;
        }
      }
    }

    return paths[m - 1][n - 1];
  }
}
