package ImplementStrStr;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 1/3/2015
 */
public class Solution
{
  public int strStr(String haystack, String needle)
  {
    if (haystack == null || needle == null || haystack.length() < needle.length())
    {
      return -1;
    }

    for (int i = 0; i <= haystack.length() - needle.length(); i++)
    {
      if (haystack.substring(i, i + needle.length()).equals(needle))
      {
        return i;
      }
    }

    return -1;
  }
}
