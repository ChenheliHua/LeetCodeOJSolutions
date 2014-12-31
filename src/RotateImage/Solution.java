package RotateImage;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/31/2014
 */
public class Solution
{
  public void rotate(int[][] matrix)
  {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
    {
      return;
    }

    int n = matrix.length;

    for (int i = 0; i < n / 2; i++)
    {
      for (int j = i; j < n - i - 1; j++)
      {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[n - j - 1][i];
        matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
        matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
        matrix[j][n - i - 1] = tmp;
      }
    }
  }
}
