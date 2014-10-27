package InterleavingString;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/27/2014
 */
public class Solution
{
  int[][][] dp;

  public boolean isInterleave(String s1, String s2, String s3)
  {
    if (s1 == null || s2 == null || s3 == null)
    {
      return false;
    }

    if (s3.length() != s1.length() + s2.length())
    {
      return false;
    }

    // True: 1
    // False: -1
    // Not Computed Yet: 0
    dp = new int[s1.length() + 1][s2.length() + 1][s3.length() + 1];

    return isInterleaveKernel(s1, 0, s2, 0, s3, 0);
  }

  private boolean isInterleaveKernel(String s1, int idx1, String s2, int idx2, String s3, int idx3)
  {
    if (dp[idx1][idx2][idx3] != 0)
    {
      return dp[idx1][idx2][idx3] == 1;
    }

    if (idx3 == s3.length())
    {
      boolean result = (idx1 == s1.length() && idx2 == s2.length());

      dp[idx1][idx2][idx3] = result ? 1 : -1;
      return result;
    }

    if (idx1 == s1.length())
    {
      if (s3.charAt(idx3) == s2.charAt(idx2))
      {
        boolean result = isInterleaveKernel(s1, idx1, s2, idx2 + 1, s3, idx3 + 1);

        dp[idx1][idx2][idx3] = result ? 1 : -1;
        return result;
      }
      else
      {
        dp[idx1][idx2][idx3] = -1;
        return false;
      }
    }
    else if (idx2 == s2.length())
    {
      if (s3.charAt(idx3) == s1.charAt(idx1))
      {
        boolean result = isInterleaveKernel(s1, idx1 + 1, s2, idx2, s3, idx3 + 1);

        dp[idx1][idx2][idx3] = result ? 1 : -1;
        return result;
      }
      else
      {
        dp[idx1][idx2][idx3] = -1;
        return false;
      }
    }
    else
    {
      if (s3.charAt(idx3) == s1.charAt(idx1) && s3.charAt(idx3) == s2.charAt(idx2))
      {
        boolean result = isInterleaveKernel(s1, idx1 + 1, s2, idx2, s3, idx3 + 1) ||
          isInterleaveKernel(s1, idx1, s2, idx2 + 1, s3, idx3 + 1);

        dp[idx1][idx2][idx3] = result ? 1 : -1;
        return result;
      }
      else if (s3.charAt(idx3) == s1.charAt(idx1))
      {
        boolean result = isInterleaveKernel(s1, idx1 + 1, s2, idx2, s3, idx3 + 1);

        dp[idx1][idx2][idx3] = result ? 1 : -1;
        return result;
      }
      else if (s3.charAt(idx3) == s2.charAt(idx2))
      {
        boolean result = isInterleaveKernel(s1, idx1, s2, idx2 + 1, s3, idx3 + 1);

        dp[idx1][idx2][idx3] = result ? 1 : -1;
        return result;
      }
      else
      {
        dp[idx1][idx2][idx3] = -1;
        return false;
      }
    }
  }
}
