package ReverseWordsInAString;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 12/6/2014
 */
public class Solution
{
  public String reverseWords(String s)
  {
    if (s == null || s.length() == 0)
    {
      return s;
    }

    String[] words = s.split(" ");

    StringBuilder sb = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--)
    {
      if (words[i].length() > 0)
      {
        if (sb.length() > 0)
        {
          sb.append(" ");
        }

        sb.append(words[i]);
      }
    }

    return sb.toString();
  }
}
