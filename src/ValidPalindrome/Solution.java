package ValidPalindrome;

/**
 * Author: Chenheli Hua
 * Email: huachenheli@outlook.com
 * Date: 10/11/2014
 */
public class Solution
{
  public boolean isPalindrome(String s)
  {
    if (s == null)
    {
      return false;
    }

    int i = 0;
    int j = s.length() - 1;

    while (i < j)
    {
      while (!isAlphanumeric(s.charAt(i)) && i < j)
      {
        i++;
      }

      while (!isAlphanumeric(s.charAt(j)) && i < j)
      {
        j--;
      }

      if (i < j)
      {
        if (s.charAt(i) != s.charAt(j) &&
          s.charAt(i) != 'A' + (s.charAt(j) - 'a') &&
          s.charAt(i) != 'a' + (s.charAt(j) - 'A'))
        {
          return false;
        }
      }

      i++;
      j--;
    }

    return true;

  }

  private boolean isAlphanumeric(char c)
  {
    return (c >= 'a' && c <= 'z') ||
      (c >= 'A' && c <= 'Z') ||
      (c >= '0' && c <= '9');
  }
}
