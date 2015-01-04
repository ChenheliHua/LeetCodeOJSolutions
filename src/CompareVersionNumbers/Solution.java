package CompareVersionNumbers;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/3/2015
 */
public class Solution
{
  public int compareVersion(String version1, String version2)
  {
    if (version1 == null ||
      version1.length() == 0 ||
      version2 == null ||
      version2.length() == 0)
    {
      return 0;
    }

    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");

    for (int i = 0; i < v1.length; i++)
    {
      if (i == v2.length)
      {
        while (i < v1.length)
        {
          if (Integer.parseInt(v1[i]) != 0)
          {
            return 1;
          }

          i++;
        }

        return 0;
      }

      int n1 = Integer.parseInt(v1[i]);
      int n2 = Integer.parseInt(v2[i]);

      if (n1 > n2)
      {
        return 1;
      }
      else if (n1 < n2)
      {
        return -1;
      }
    }

    for (int i = v1.length; i < v2.length; i++)
    {
      if (Integer.parseInt(v2[i]) != 0)
      {
        return -1;
      }
    }

    return 0;
  }
}
