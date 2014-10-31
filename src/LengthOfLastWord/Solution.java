package LengthOfLastWord;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/31/2014
 */
public class Solution
{
  public int lengthOfLastWord(String s)
  {
    if (s == null || s.length() == 0)
    {
      return 0;
    }

    int end = s.length() - 1;

    while (end >= 0 && s.charAt(end) == ' ')
    {
      end--;
    }

    int start = end - 1;

    while (start >= 0 && s.charAt(start) != ' ')
    {
      start--;
    }

    return end == -1 ? 0 : end - start;
  }
}
